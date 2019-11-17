package by.javatr.task3.runner;

//3. Окружность вписана в квадрат заданной площади. Найти площадь квадрата, вписанного в эту
//окружность. Во сколько раз площадь вписанного квадрата меньше площади заданного?

import by.javatr.scanner.DataScanner;
import by.javatr.task3.util.Task3Service;

/**
 * @author Aleh Yemelyanchyk on 11/16/2019.
 */
public class Task3Main {
    private static DataScanner dataScanner = new DataScanner();
    private static Task3Service task3Service = new Task3Service();

    public static void main(String[] args) {
        System.out.println("Enter outer square area:");
        double outerSquare = dataScanner.readDouble();
        double innerSquare = task3Service.findAreaOfInnerSquare(outerSquare);
        double differenceInSquareSize =
                task3Service.findTimesInnerSquareSmallerOuterSquare(innerSquare, outerSquare);
        System.out.println("Inner square area = " +
                innerSquare + " cm2.");
        System.out.println("Inner square " + differenceInSquareSize + " times smaller of outer square");
    }
}
