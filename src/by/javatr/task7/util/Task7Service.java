package by.javatr.task7.util;

/**
 * @author Aleh Yemelyanchyk on 11/16/2019.
 */
public class Task7Service {

    public char chooseClosestToZeroPoint(int x1, int y1, int x2, int y2) {
        if (distanceToZero(x1, y1) == distanceToZero(x2, y2)) {
            return 'A';
        }
        return (distanceToZero(x1, y1) < distanceToZero(x2, y2)) ? 'A' : 'B';
    }

    private double distanceToZero(int x, int y) {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
}
