package com.jagriti.bmtplus.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTimeUtils {

    public static String getFormattedDate(){
        DateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy");
        Date date = new Date();
        return dateFormat.format(date);
    }

    public static String getFormattedDateForConsentForm(){
        DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
        Date date = new Date();
        return dateFormat.format(date);
    }

    public static String getFormattedDateForCoreAttribute(){
        DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy hh:mmaa");
        Date date = new Date();
        return dateFormat.format(date);
    }

    public static String getFormattedTime(){
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        Date date = new Date();
        return dateFormat.format(date);
    }

    public static String getFormattedTimeForTransfusion() {
        // Get current time
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());

        // Round minutes to the nearest multiple of 4
        int minutes = calendar.get(Calendar.MINUTE);
        int roundedMinutes = (minutes / 4) * 4; // Round down to the nearest multiple of 4
        calendar.set(Calendar.MINUTE, roundedMinutes);

        // Format the time
        DateFormat dateFormat = new SimpleDateFormat("HH:mm");
        return dateFormat.format(calendar.getTime());
    }


    public static String getFormattedFutureDate() {
        DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
        // Get current date
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 2); // Add 2 days to current date
        Date futureDate = calendar.getTime();
        return dateFormat.format(futureDate);
    }

    public static String getFormattedTomorrowDate() {
        DateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy");
        // Get current date
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, 1); // Add 2 days to current date
        Date futureDate = calendar.getTime();
        return dateFormat.format(futureDate);
    }

    public static String getFormattedFutureDateForPatient() {
        DateFormat day = new SimpleDateFormat("dd");
        int increaseNumber = 2;
        Date systemDate1 = new Date();
        String dateOfSystem1 = day.format(systemDate1);
        int addDate = Integer.parseInt(dateOfSystem1);
        int increasedDate = addDate + increaseNumber; // Correct increment
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(systemDate1);
        calendar.add(Calendar.DATE, increaseNumber); // Adjusting date

        DateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy");
        Date dates = calendar.getTime();
        String date1 = dateFormat.format(dates);
        return date1;
    }

    public static String getFormattedPastDate() {
        // Get yesterday's date
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, -1); // Subtract 1 day
        Date yesterday = calendar.getTime();

        // Format the date
        DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
        String formattedDate = dateFormat.format(yesterday);

        return formattedDate;
    }

    public static String getFormattedPastDateForBloodProduct() {
        // Get yesterday's date
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, -1); // Subtract 1 day
        Date yesterday = calendar.getTime();

        // Format the date
        DateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy");
        String formattedDate = dateFormat.format(yesterday);

        return formattedDate;
    }

    public static String getFutureDateForBMT() {
        DateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy");
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, 5);

        Date futureDate = calendar.getTime();
        return dateFormat.format(futureDate);
    }

    public static String getMinimumDate(){
        DateFormat dateFormat = new SimpleDateFormat("01 'Jun' 1995");
        Date date = new Date();
        return dateFormat.format(date);
    }

    public static String getFutureDate(){
        DateFormat dateFormat = new SimpleDateFormat("01 'Jun' 2027");
        Date date = new Date();
        return dateFormat.format(date);
    }

    public static String getFutureDateForRecurringDate(){
        DateFormat dateFormat = new SimpleDateFormat("04/10/2025");
        Date date = new Date();
        return dateFormat.format(date);
    }
}
