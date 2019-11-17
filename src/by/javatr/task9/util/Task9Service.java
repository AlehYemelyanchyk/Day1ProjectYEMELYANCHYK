package by.javatr.task9.util;

/**
 * @author Aleh Yemelyanchyk on 11/16/2019.
 */
public class Task9Service {

    public double countCircleSquare(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public double countCircleLength(double radius) {
        return 2 * Math.PI * radius;
    }
}
