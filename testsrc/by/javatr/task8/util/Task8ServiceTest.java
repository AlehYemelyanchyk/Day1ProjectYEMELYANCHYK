package by.javatr.task8.util;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Aleh Yemelyanchyk on 11/17/2019.
 */
public class Task8ServiceTest {

    private final static double DELTA = 0.0001;
    private Task8Service task8Service = new Task8Service();

    @Test
    public void countFunctionCalculationXMoreOrEquals3Test() {
        double x = 3;
        double expected = 27;
        double actual = task8Service.countFunction(x);

        Assert.assertEquals(expected, actual, DELTA);
    }

    @Test
    public void countFunctionCalculationXLess3Test() {
        double x = 2;
        double expected = 0.5;
        double actual = task8Service.countFunction(x);

        Assert.assertEquals(expected, actual, DELTA);
    }
}