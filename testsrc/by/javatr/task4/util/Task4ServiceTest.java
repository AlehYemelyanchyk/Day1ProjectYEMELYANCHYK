package by.javatr.task4.util;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Aleh Yemelyanchyk on 11/17/2019.
 */
public class Task4ServiceTest {

    private Task4Service task4Service = new Task4Service();

    @Test
    public void hasTwoEvenNumbersCanFindEvenNumbersTest() {
        int[] numbers = {1, 2, 3, 4, 5, 7};
        Assert.assertTrue(task4Service.hasTwoEvenNumbers(numbers));
    }
}