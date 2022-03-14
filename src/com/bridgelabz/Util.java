package com.bridgelabz;

public class Util {

    public static int day(int month, int day, int year) {
        int y = year - (14 - month) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        int d = (day + x + (31 * m) / 12) % 7;
        return d;
    }


   public static int temperaturConversion(int tem, char t) {
        int conver;
        if (t == 'c' || t == 'C') {
            conver = (tem * 9 / 5) + 32;
        } else if (t == 'f' || t == 'F') {
            conver = (tem - 32) * 5 / 9;
        } else {
            System.out.println("Enter correct input");
            return 0;

        }
        return conver;
    }
    static double monthlyPayment(double p, double y, double r) {
        double n = 12 * y;
        double r0 = r / (12 * 100);
        double payment = p * r0 / (1 - Math.pow((1 + r0), -n));
        return payment;
    }


}
