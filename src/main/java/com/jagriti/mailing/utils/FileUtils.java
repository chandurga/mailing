package com.jagriti.mailing.utils;

import java.io.File;
import java.net.URL;

public class FileUtils {
  private FileUtils(){
    throw new IllegalStateException("Util class. Instance not allowed");
  }

  public static File getFile(String filePath) {
    URL resourceURL = FileUtils.class.getClassLoader().getResource(filePath);
    if (resourceURL == null) {
      throw new IllegalArgumentException(String.format("%s file is not found!", filePath));
    } else {
      return new File(resourceURL.getFile());
    }
  }
}
