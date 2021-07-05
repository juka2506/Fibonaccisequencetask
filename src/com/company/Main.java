package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the position you want:  ");
        int position = scanner.nextInt();

        // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987 - Fibonacci numbers
        // 0, 1, 2, 3, 4, 5, 6, 7,   8,  9, 10, 11,  12,  13,  14,  15,  16 - Position

        //Binet's Formula for the nth Fibonacci number
        double phi = (Math.sqrt(5) + 1) / 2;
        double fibOnPosition = (Math.pow(phi, position) - Math.pow((-phi), (-position))) / (Math.sqrt(5));

        System.out.println(position + "th Fibonacci number is " + (int) fibOnPosition);

        /*
        // Alternative solution
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the upper limit: ");
        int upperLimit = scanner.nextInt();

        int firstNumber = 1;
        int secondNumber = 1;
        int currentNumber = 0;

        for (int i = 2; i < upperLimit; i++) {
            currentNumber = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = currentNumber;

        }
        System.out.println("The cumbe of the fibonacci sequence at " + upperLimit + " is " + currentNumber);
    */
    }

}
