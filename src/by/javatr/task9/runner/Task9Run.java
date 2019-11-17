package by.javatr.task9.runner;

//9. Вычислить длину окружности и площадь круга одного и того же заданного радиуса R

import by.javatr.scanner.DataScanner;
import by.javatr.task9.util.Task9Service;

/**
 * @author Aleh Yemelyanchyk on 11/16/2019.
 */
public class Task9Run {
    private static DataScanner dataScanner = new DataScanner();
    private static Task9Service task9Service = new Task9Service();

    public static void main(String[] args) {
        System.out.println("Enter a circle radius:");
        double radius = dataScanner.readDouble();
        System.out.println("The circle's square = " + task9Service.countCircleSquare(radius));
        System.out.println("The circle's length = " + task9Service.countCircleLength(radius));
    }
}
