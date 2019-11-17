package by.javatr.task3.util;

/**
 * @author Aleh Yemelyanchyk on 11/16/2019.
 */
public class Task3Service {

    public double findAreaOfInnerSquare(double square) {
        double squareSideLength = findSquareSideLength(square);
        return Math.pow(squareSideLength, 2) / 2; // circle diagonal equals outer square side length;
    }

    private double findSquareSideLength(double square) {
        return Math.sqrt(square);
    }

    public double findTimesInnerSquareSmallerOuterSquare(double innerSquare, double outerSquare) {
        return outerSquare / innerSquare;
    }
}
