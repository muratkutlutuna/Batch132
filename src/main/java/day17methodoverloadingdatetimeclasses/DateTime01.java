package day17methodoverloadingdatetimeclasses;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTime01 {
    public static void main(String[] args) {

        //Type code to get current date
        Date currentDate = new Date();
        System.out.println(currentDate);//Sat Feb 04 07:57:48 CET 2023

        System.out.println(currentDate.getTime());//1675493905820 millisecond
                                                  //Milliseconds from "January 1st 1970" to the "current time"

        //Type code to get current time in your local area
        LocalTime myTime = LocalTime.now();
        System.out.println(myTime);//08:00:51.658889968 ==> Current Time ==> Hours:Minutes:Seconds:NanoSeconds

        //Type code to get current date in your local area
        LocalDate myDate = LocalDate.now();
        System.out.println(myDate);//2023-02-04

        //Type code to get current time and current date in your local area
        LocalDateTime myDateTime = LocalDateTime.now();
        System.out.println(myDateTime);//2023-02-04T08:04:12.894836218

        //How to get specific component from fate and time
        System.out.println(myDate.getMonthValue());//1
        System.out.println(myDate.getMonth());//JANUARY
        System.out.println(myDateTime.getDayOfWeek());//TUESDAY

        //How to get time in another timezone
        System.out.println(LocalDateTime.now(ZoneId.of("Asia/Tokyo")));
        System.out.println(LocalDateTime.now(ZoneId.of("Europe/Istanbul")));
        System.out.println(LocalDateTime.now(ZoneId.of("Europe/Zurich")));
        System.out.println(LocalDateTime.now(ZoneId.of("Asia/Baku")));
        //How to go future or past in date and time
        System.out.println(myDate.plusYears(3).plusMonths(4).plusDays(12));//2026-06-16
        System.out.println(myTime.plusHours(3).plusMinutes(20));//11:30:25.192638148

        //How to compare two dates
        LocalDate firstKidDob = LocalDate.of(2005, 8, 23);
        LocalDate secondKidDob = LocalDate.of(2011, 3, 11);

        boolean isFirstKidAfter = firstKidDob.isAfter(secondKidDob);
        System.out.println("isFirstKidAfter = " + isFirstKidAfter);//false

        boolean isFirstKidBefore = firstKidDob.isBefore(secondKidDob);
        System.out.println("isFirstKidBefore = " + isFirstKidBefore);//true

        boolean isFirstKidEqualsToSecondKid = firstKidDob.isEqual(secondKidDob);
        System.out.println("isFirstKidEqualsToSecondKid = " + isFirstKidEqualsToSecondKid);//false

        //How to format Date
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd:MM:yyyy");

        //d-->1, 2, 3,..., 10, 11, 12,..., 31
        //dd-->01, 02, 03,..., 10, 11, 12,..., 31
        //M-->1, 2, 3,..., 10, 11, 12
        //MM-->01, 02, 03,..., 10, 11, 12
        //MMM-->Jan, Feb, Mar,..., Dec
        //MMMM-->January, February, March,..., December
        //yy-->23
        //yyyy-->2023
        String formattedMyDate = dtf.format(myDate);
        System.out.println("formattedMyDate = " + formattedMyDate);//04:02:2023

        //How to format time
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("HH:mm a");

        //HH--> 24 hours system
        //hh--> 12 hours system
        //After time pattern leave a space put "a" it puts AM or PM next to the time
        String formattedTime = dtf2.format(myTime);
        System.out.println("formattedTime = " + formattedTime);//08:24 AM

    }
}
