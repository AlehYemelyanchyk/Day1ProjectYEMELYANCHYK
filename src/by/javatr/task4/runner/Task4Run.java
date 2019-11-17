package by.javatr.task4.runner;

//4. Составить программу, печатающую значение true, если указанное высказывание является истинным,
//и false — в противном случае: среди заданных целых чисел А, В, С, D есть хотя бы два четных.

import by.javatr.scanner.DataScanner;
import by.javatr.task4.util.Task4Service;

/**
 * @author Aleh Yemelyanchyk on 11/16/2019.
 */
public class Task4Run {
    private static DataScanner dataScanner = new DataScanner();
    private static Task4Service task4Service = new Task4Service();

    public static void main(String[] args) {
        System.out.println("Enter integer A: ");
        int a = dataScanner.readInteger();
        System.out.println("Enter integer B: ");
        int b = dataScanner.readInteger();
        System.out.println("Enter integer C: ");
        int c = dataScanner.readInteger();
        System.out.println("Enter integer D: ");
        int d = dataScanner.readInteger();
        System.out.println(task4Service.hasTwoEvenNumbers(a, b, c, d));
    }
}
