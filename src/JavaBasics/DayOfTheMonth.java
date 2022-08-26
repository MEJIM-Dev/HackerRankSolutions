package JavaBasics;

import java.time.LocalDate;

public class DayOfTheMonth {
    public static void main(String[] args) {
//        08 05 2015
        int year =2015;
        int day = 5;
        int month = 8;
        System.out.println( findDay(month,day,year));
    }
     public static String findDay(int month, int day, int year) {
         LocalDate date = LocalDate.of(year, month, day);
         return String.valueOf(date.getDayOfWeek());
     }
}
