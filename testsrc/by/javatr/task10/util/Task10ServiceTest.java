package by.javatr.task10.util;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Aleh Yemelyanchyk on 11/17/2019.
 */
public class Task10ServiceTest {

    private Task10Service task10Service = new Task10Service();

    @Test
    public void countFunctionFCalculationTest() {
        String expected = String.format("%-12.4f%.2f\n", 0.0175, 1.00);
        String[] result = task10Service.returnTableAsArrayOfStrings(1, 2, 1);
        String actual = result[0];

        Assert.assertEquals(expected, actual);
    }
}