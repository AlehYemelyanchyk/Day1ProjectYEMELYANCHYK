package by.javatr.task5.runner;

//5. Составить программу, печатающую значение true, если указанное высказывание является истинным,
//и false — в противном случае: является ли целое число совершенным (сумма делителей равна
//самому числу).

import by.javatr.scanner.DataScanner;
import by.javatr.task5.util.Task5Service;

/**
 * @author Aleh Yemelyanchyk on 11/16/2019.
 */
public class Task5Run {
    private static DataScanner dataScanner = new DataScanner();
    private static Task5Service task5Service = new Task5Service();

    public static void main(String[] args) {
        System.out.println("Enter an integer number:");
        int number = dataScanner.readInteger();
        System.out.println(task5Service.isPerfectNumber(number));
    }


}
