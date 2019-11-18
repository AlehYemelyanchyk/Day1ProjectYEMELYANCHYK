package by.javatr.task2.util;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Aleh Yemelyanchyk on 11/17/2019.
 */
public class Task2ServiceTest {

    private Task2Service task2Service = new Task2Service();

    @Test
    public void takeDaysInMonthIsRightDaysAmountTest() {
        int expected = 31;
        int month = 3;
        int year = 2001;
        int actual = task2Service.takeDaysInMonth(month, year);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void takeDaysInMonthIsLeapYearTest() {
        int expected = 29;
        int month = 2;
        int year = 2000;
        int actual = task2Service.takeDaysInMonth(month, year);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void takeDaysInMonthIsNotLeapYearTest() {
        int expected = 28;
        int month = 2;
        int year = 2002;
        int actual = task2Service.takeDaysInMonth(month, year);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void takeDaysInMonthIncorrectMonthTest() {
        int expected = -1;
        int[] monthValues = {13, -1, 0};
        int year = 2000;
        for (int month : monthValues) {
            int actual = task2Service.takeDaysInMonth(month, year);
            Assert.assertEquals(expected, actual);
        }
    }

    @Test
    public void takeDaysInMonthIncorrectYearTest() {
        int expected = -1;
        int month = 3;
        int[] yearValues = {-1, 0, 10000};
        for (int year : yearValues) {
            int actual = task2Service.takeDaysInMonth(month, year);
            Assert.assertEquals(expected, actual);
        }
    }
}