package by.javatr.task1.runner;

//1. Написать программу, позволяющую по последней цифре числа определить последнюю цифру
// его квадрата.

import by.javatr.scanner.DataScanner;
import by.javatr.task1.util.Task1Service;

public class Task1Run {

    private static DataScanner dataScanner = new DataScanner();
    private static Task1Service task1Service = new Task1Service();

    public static void main(String[] args) {
        System.out.println("Enter an integer number:");
        int number = dataScanner.readInteger();
        int lastDigitOfSquareNumber = task1Service.findLastDigitOfSquareNumber(number);
        System.out.println("Last digit of square of number " + number + " is " + lastDigitOfSquareNumber);
    }
}
