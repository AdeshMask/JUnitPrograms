package com.bridgelabz;

import java.util.Scanner;

public class DayOfWeek {

    public static boolean isLeapYear(int year) {
        if  ((year % 4 == 0) && (year % 100 != 0))
            return true;
        if  (year % 400 == 0)
            return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Day::");
        int day = scanner.nextInt();
        System.out.println("Enter Month::");
        int month =  scanner.nextInt();
        System.out.println("Enter Year ::");
        int years = scanner.nextInt();

        String[] months = {
                "",
                "January", "February", "March",
                "April", "May", "June",
                "July", "August", "September",
                "October", "November", "December"
        };
        int[] lastDays = {
                0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };
        String[] days ={
                "Monday","Tuesday","Wednesday",
                "Thursday","Friday","Saturday","Saturday"
        };
        if (month == 2 && isLeapYear(years)) lastDays[month] = 29;
        System.out.println(day+ " " + months[month] + " " + years);
        System.out.println("Day::"+days[(day % 7)]);
    }
}
