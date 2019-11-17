package by.javatr.task8.runner;

//8. Вычислить значение функции F(x).

import by.javatr.scanner.DataScanner;
import by.javatr.task8.util.Task8Service;

/**
 * @author Aleh Yemelyanchyk on 11/16/2019.
 */
public class Task8Run {
    private static DataScanner dataScanner = new DataScanner();
    private static Task8Service task8Service = new Task8Service();

    public static void main(String[] args) {
        System.out.println("Enter number x:");
        double x = dataScanner.readDouble();
        System.out.println("F(x) = " + task8Service.countFunction(x));
    }
}
