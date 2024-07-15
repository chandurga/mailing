package com.jagriti.bmtplus.config;

public enum TestEnv {

  BMT_PLUS("bmtplus");

  TestEnv(String value){
    this.value = value;
  }

  private String value;

  public String getValue(){
    return value;
  }
}
