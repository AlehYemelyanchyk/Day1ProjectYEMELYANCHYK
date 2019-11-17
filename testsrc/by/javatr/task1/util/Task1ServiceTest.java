package by.javatr.task1.util;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Aleh Yemelyanchyk on 11/17/2019.
 */


public class Task1ServiceTest {

    private Task1Service task1Service = new Task1Service();

    @Test
    public void findLastDigitOfSquareNumberCalculationTest() {
        int number = 532;
        int expected = 4;
        int actual = task1Service.findLastDigitOfSquareNumber(number);

        Assert.assertEquals(expected, actual);
    }
}