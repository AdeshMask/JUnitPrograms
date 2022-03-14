package com.bridgelabz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int array[] = {1000,500,100,50,10,5,2,1};
        int i=0;
        int countOfNotes[] = new int[8];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Amount ::");
        int rupees = scanner.nextInt();
        while ( rupees != 0){
            if (rupees>=array[i]){
                countOfNotes[i] = rupees / array[i];
                rupees = rupees - countOfNotes[i] * array[i];
                System.out.println(array[i]+" : " +countOfNotes[i]);
                i = 0;
            }
            i++;
        }

    }
}
