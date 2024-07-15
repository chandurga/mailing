package com.jagriti.bmtplus.pages;

import static com.codeborne.selenide.Selenide.page;

import com.jagriti.bmtplus.config.TestEnvFactory;
import com.typesafe.config.Config;

public abstract class Page<T extends Page<?>> {
  protected static final Config CONFIG = TestEnvFactory.getInstance().getConfig();

  protected final T self;

  protected Page(final Class<T> childClass) {
    this.self = childClass.cast(this);
  }

  /**
   * Sugar syntax that can be used in all child pages
   *
   * @return
   */
  public T and() {
    return self;
  }

  /**
   * Sugar syntax that can be used in all child pages
   *
   * @return
   */
  public T then() {
    return self;
  }

  public T it() {
    return self;
  }

  public <P> P shouldNavigateTo(Class<P> clazz) {
    return page(clazz);
  }
}
