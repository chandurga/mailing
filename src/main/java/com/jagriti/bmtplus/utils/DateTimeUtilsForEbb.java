package com.jagriti.bmtplus.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeUtilsForEbb {

    public static String getFormattedDate() {
        DateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
        Date date = new Date();
        return dateFormat.format(date);
    }

    public static String getFormattedTime() {
        DateFormat dateFormat = new SimpleDateFormat("HHmmaa");
        Date date = new Date();
        return dateFormat.format(date);
    }

}
