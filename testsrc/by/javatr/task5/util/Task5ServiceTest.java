package by.javatr.task5.util;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Aleh Yemelyanchyk on 11/17/2019.
 */
public class Task5ServiceTest {

    private Task5Service task5Service = new Task5Service();

    @Test
    public void isPerfectNumberCanFindTest() {
        int number = 6;
        Assert.assertTrue(task5Service.isPerfectNumber(number));
    }
}