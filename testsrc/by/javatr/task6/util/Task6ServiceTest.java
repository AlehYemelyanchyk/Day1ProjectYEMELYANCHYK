package by.javatr.task6.util;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Aleh Yemelyanchyk on 11/17/2019.
 */
public class Task6ServiceTest {

    private Task6Service task6Service = new Task6Service();

    @Test
    public void countFullHoursPassCalculationTest() {
        int seconds = 3610;
        int expected = 1;
        int actual = task6Service.countFullHoursPass(seconds);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void countFullHoursPassIncorrectSecondsTest() {
        int[] secondsValues = {-1, 86400};
        int expected = -1;
        for (int seconds : secondsValues) {
            int actual = task6Service.countFullHoursPass(seconds);
            Assert.assertEquals(expected, actual);
        }
    }

    @Test
    public void countFullMinutesPassCalculationTest() {
        int seconds = 3670;
        int expected = 1;
        int actual = task6Service.countFullMinutesPass(seconds);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void countFullSecondsPassCalculationTest() {
        int seconds = 3670;
        int expected = 10;
        int actual = task6Service.countFullSecondsPass(seconds);

        Assert.assertEquals(expected, actual);
    }
}