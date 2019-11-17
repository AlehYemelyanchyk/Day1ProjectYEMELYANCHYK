package by.javatr.task10.util;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Aleh Yemelyanchyk on 11/17/2019.
 */
public class Task10ServiceTest {

    private final static double DELTA = 0.0001;
    private Task10Service task10Service = new Task10Service();

    @Test
    public void countFunctionFCalculationTest() {
        double x = 1.0;
        double expected = 0.0174;
        double actual = task10Service.countFunctionF(x);

        Assert.assertEquals(expected, actual, DELTA);
    }
}