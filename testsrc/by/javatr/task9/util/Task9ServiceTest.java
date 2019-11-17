package by.javatr.task9.util;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Aleh Yemelyanchyk on 11/17/2019.
 */
public class Task9ServiceTest {

    private Task9Service task9Service = new Task9Service();
    private final static double DELTA = 0.0001;

    @Test
    public void countCircleSquareCalculationTest() {
        double radius = 4.3;
        double expected = 58.0880;
        double actual = task9Service.countCircleSquare(radius);

        Assert.assertEquals(expected, actual, DELTA);
    }

    @Test
    public void countCircleLengthCalculationTest() {
        double radius = 4.3;
        double expected = 27.0176;
        double actual = task9Service.countCircleLength(radius);

        Assert.assertEquals(expected, actual, DELTA);
    }
}