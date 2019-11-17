package by.javatr.task8.util;

/**
 * @author Aleh Yemelyanchyk on 11/16/2019.
 */
public class Task8Service {
    public double countFunction(double x) {
        return x >= 3 ? (Math.pow(-x, 2) + 3 * x + 9) : (1 / ((Math.pow(x, 3) - 6)));
    }
}
