package com.jagriti.bmtplus.utils;

public class NumberUtils {
    private NumberUtils(){
        throw new IllegalStateException("Util class. Instance not allowed");
    }

    public static int getRandomNumberInARange(int min, int max){
       return (int) (Math.random() * (max-min)) + min;
   }

}
