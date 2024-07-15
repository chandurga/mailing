package com.jagriti.mailing.extensions.report;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch.core.IndexResponse;
import com.jagriti.mailing.config.TestEnvFactory;
import com.typesafe.config.Config;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

@Slf4j
public class Elastic {
    private static final Config CONFIG = TestEnvFactory.getInstance().getConfig();
    private static final ElasticServerChoices ELASTIC_SERVER = CONFIG.getEnum( ElasticServerChoices.class,"ELASTIC_SERVER");
    private static final String ELASTIC_INDEX = getStringConfig("ELASTIC_INDEX");
    private static final ElasticsearchClient ELASTICSEARCH_CLIENT = ElasticHighLevelAPIClientSingleton.getInstance().getElasticsearchClient();

    private Elastic() {

    }

    public static void publishResults(TestRunMetaData testRunMetaData) throws IOException {
        IndexResponse response = ELASTICSEARCH_CLIENT.index(i -> i
                    .index(ELASTIC_INDEX)
                    .document(testRunMetaData)
            );

        log.info("response.id: {}", response.id());
        log.info("response.result: {}", response.result());
    }

    private static String getStringConfig(String configName) {
        return CONFIG.getString(ELASTIC_SERVER.getValue() + "." + configName);
    }
}
