package by.javatr.task4.util;

/**
 * @author Aleh Yemelyanchyk on 11/16/2019.
 */
public class Task4Service {
    public boolean hasTwoEvenNumbers(int... numbers) {
        int count = 0;
        for (int number : numbers) {
            if (isEven(number)) {
                count++;
            }
        }
        return count >= 2;
    }

    private boolean isEven(int number) {
        return number % 2 == 0;
    }
}
