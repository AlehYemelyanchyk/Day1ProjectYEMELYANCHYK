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
    public void takeDaysInMonthIncorrectMonthBiggerTest() {
        int expected = -1;
        int month = 13;
        int year = 2000;
        int actual = task2Service.takeDaysInMonth(month, year);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void takeDaysInMonthIncorrectMonthNegativeTest() {
        int expected = -1;
        int month = -1;
        int year = 2000;
        int actual = task2Service.takeDaysInMonth(month, year);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void takeDaysInMonthIncorrectYearBiggerTest() {
        int expected = -1;
        int month = 3;
        int year = 10000;
        int actual = task2Service.takeDaysInMonth(month, year);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void takeDaysInMonthIncorrectYearZeroOrNegativeTest() {
        int expected = -1;
        int month = 3;
        int year = 0;
        int actual = task2Service.takeDaysInMonth(month, year);

        Assert.assertEquals(expected, actual);
    }

}