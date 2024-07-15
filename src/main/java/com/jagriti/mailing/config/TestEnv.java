package com.jagriti.mailing.config;

public enum TestEnv {

  MAILING("mailing");

  TestEnv(String value){
    this.value = value;
  }

  private String value;

  public String getValue(){
    return value;
  }
}
