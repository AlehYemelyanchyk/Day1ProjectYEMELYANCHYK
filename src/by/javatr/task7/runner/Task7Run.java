package by.javatr.task7.runner;

//7. Даны две точки А(х1, у1) и В(х2, у2). Составить алгоритм, определяющий, которая из точек
//находится ближе к началу координат. x y.

import by.javatr.scanner.DataScanner;
import by.javatr.task7.util.Task7Service;

/**
 * @author Aleh Yemelyanchyk on 11/16/2019.
 */
public class Task7Run {

    private static DataScanner dataScanner = new DataScanner();
    private static Task7Service task7Service = new Task7Service();

    public static void main(String[] args) {
        System.out.println("Enter x1 for A:");
        int x1 = dataScanner.readInteger();
        System.out.println("Enter y1 for A:");
        int y1 = dataScanner.readInteger();
        System.out.println("Enter x2 for B:");
        int x2 = dataScanner.readInteger();
        System.out.println("Enter y2 for B:");
        int y2 = dataScanner.readInteger();
        System.out.println("Closest point to zero is " +
                task7Service.chooseClosestToZeroPoint(x1, y1, x2, y2));
    }
}
