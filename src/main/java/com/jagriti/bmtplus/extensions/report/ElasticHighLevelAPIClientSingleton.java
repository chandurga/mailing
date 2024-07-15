package com.jagriti.bmtplus.extensions.report;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.json.jackson.JacksonJsonpMapper;
import co.elastic.clients.transport.ElasticsearchTransport;
import co.elastic.clients.transport.rest_client.RestClientTransport;
import com.jagriti.bmtplus.config.TestEnvFactory;
import com.typesafe.config.Config;
import lombok.extern.slf4j.Slf4j;
import org.elasticsearch.client.RestClient;

@Slf4j
public class ElasticHighLevelAPIClientSingleton {
    private static final Config CONFIG = TestEnvFactory.getInstance().getConfig();
    private static final ElasticServerChoices ELASTIC_SERVER = CONFIG.getEnum( ElasticServerChoices.class,"ELASTIC_SERVER");
    private static final ElasticHighLevelAPIClientSingleton UNIQUE_INSTANCE = new ElasticHighLevelAPIClientSingleton();

    private ElasticsearchClient elasticsearchClient ;
    private ElasticHighLevelAPIClientSingleton() {
        elasticsearchClient = setElasticsearchClient();
    }

    public static ElasticHighLevelAPIClientSingleton getInstance() {
        return UNIQUE_INSTANCE;
    }

    public ElasticsearchClient getElasticsearchClient(){
        return elasticsearchClient;
    }

    private ElasticsearchClient setElasticsearchClient() {
        // Create the low-level client
        RestClient restClient = ElasticLowLevelRestClientFactory.getRestClient(ELASTIC_SERVER);

        // Create the transport with a Jackson mapper
        ElasticsearchTransport transport = new RestClientTransport(restClient, new JacksonJsonpMapper());

        // And create the API client
        return new ElasticsearchClient(transport);
    }
}
