package by.javatr.task2.runner;

//2. Составить программу, которая по заданным году и номеру месяца определяет количество дней в этом
//месяце и корректно определялись все високосные года.

import by.javatr.scanner.DataScanner;
import by.javatr.task2.util.Task2Service;

/**
 * @author Aleh Yemelyanchyk on 11/14/2019.
 */
public class Task2Run {

    private static DataScanner dataScanner = new DataScanner();
    private static Task2Service task2Service = new Task2Service();

    public static void main(String[] args) {
        System.out.println("Enter a month number:");
        int monthNumber = dataScanner.readInteger();
        System.out.println("Enter a year:");
        int year = dataScanner.readInteger();
        int daysInMonth = task2Service.takeDaysInMonth(monthNumber, year);
        if (daysInMonth != -1) {
            System.out.println("Month #" + monthNumber + " in " + year + " have " +
                    daysInMonth + " days.");
        } else {
            System.out.println("Whether month or year is not correct. Please, try again.\n" +
                    "Month number should be in a range from 1 to 12.\n" +
                    "Year number should be in a range from 1 to 9999.");
        }
    }
}
