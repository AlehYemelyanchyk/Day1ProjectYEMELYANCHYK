package by.javatr.task7.util;

import org.junit.Assert;
import org.junit.Test;


/**
 * @author Aleh Yemelyanchyk on 11/17/2019.
 */
public class Task7ServiceTest {

    private Task7Service task7Service = new Task7Service();

    @Test
    public void chooseClosestToZeroPointAisClosestTest() {
        char expected = 'A';
        char actual = task7Service.chooseClosestToZeroPoint(1, 1, 2, 2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void chooseClosestToZeroPointBisClosestTest() {
        char expected = 'B';
        char actual = task7Service.chooseClosestToZeroPoint(3, 3, 2, 2);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void chooseClosestToZeroPointEqualityTest() {
        char expected = 'A';
        char actual = task7Service.chooseClosestToZeroPoint(3, 3, 3, 3);

        Assert.assertEquals(expected, actual);
    }
}