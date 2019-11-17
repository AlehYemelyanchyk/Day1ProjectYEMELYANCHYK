package by.javatr.task3.util;

import org.junit.Assert;
import org.junit.Test;


/**
 * @author Aleh Yemelyanchyk on 11/17/2019.
 */
public class Task3ServiceTest {

    private final static double DELTA = 0.0001;
    private Task3Service task3Service = new Task3Service();

    @Test
    public void findAreaOfInnerSquareCalculationTest() {
        double area = 5;
        double expected = 2.5;
        double actual = task3Service.findAreaOfInnerSquare(area);

        Assert.assertEquals(expected, actual, DELTA);
    }

    @Test
    public void findTimesInnerSquareSmallerOuterSquareCalculationTest() {
        double innerSquare = 5;
        double outerSquare = 10;
        double expected = 2;
        double actual = task3Service.findTimesInnerSquareSmallerOuterSquare(innerSquare, outerSquare);

        Assert.assertEquals(expected, actual, DELTA);
    }
}