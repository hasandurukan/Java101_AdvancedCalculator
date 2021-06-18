package com.java101;

import java.util.Scanner;

public class Main {

    static void plus() {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". number :");
            number = scan.nextInt();
            if (number == 0) {
                break;
            }
            result += number;
        }
        System.out.println("Result : " + result);
    }

    static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers will you type :");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". number :");
            number = scan.nextInt();
            if (i == 1) {
                result = number;
                continue;
            }
            result -= number;
        }

        System.out.println("Result : " + result);
    }

    static void times() {
        Scanner scan = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". number :");
            number = scan.nextInt();

            if (number == 1)
                break;

            if (number == 0) {
                result = 0;
                break;
            }
            result *= number;
        }

        System.out.println("Result : " + result);
    }

    static void divided() {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers will you type :");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". number :");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Divider can not be 0");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Result : " + result);
    }

    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please type base number :");
        int base = scan.nextInt();
        System.out.print("Please type power number :");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Result : " + result);
    }

    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please type a number :");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Result : " + result);
    }

    static void mod() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please type first number :");
        int firstNumber = scan.nextInt();
        System.out.print("Please type second number :");
        int secondNumber = scan.nextInt();
        int result = 0;

        result = firstNumber % secondNumber;

        System.out.println("Result : " + result);
    }

    static void rectangleAreaAndCircumference() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please type long edge :");
        int firstEdge = scan.nextInt();
        System.out.print("Please type short edge :");
        int secondEdge = scan.nextInt();
        int resultArea = 0, resultCircumference = 0;
        resultArea = firstEdge * secondEdge;
        resultCircumference = 2 * (firstEdge + secondEdge);

        System.out.println("Result Area : " + resultArea + "\nResult Circumference :" + resultCircumference);
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1- Addition\n"
                + "2- Subtraction\n"
                + "3- Multiplication\n"
                + "4- Division\n"
                + "5- Power\n"
                + "6- Factorial\n"
                + "7- Mod\n"
                + "8- Rectangle Area and Circumference\n"
                + "0- Exit";

        do {
            System.out.println(menu);
            System.out.print("Please choose one :");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangleAreaAndCircumference();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("wrong value, please try again !");
            }
        } while (select != 0);


    }
}
