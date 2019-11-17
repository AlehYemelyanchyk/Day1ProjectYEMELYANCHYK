package by.javatr.task1.util;

/**
 * @author Aleh Yemelyanchyk on 11/14/2019.
 */
public class Task1Service {

    public int findLastDigitOfSquareNumber(int number) {
        int lastDigit = takeLastDigitOfNumber(number);
        return takeLastDigitOfNumber((int) Math.pow(lastDigit, 2));
    }

    private int takeLastDigitOfNumber(int number) {
        return number - (number / 10 * 10);
    }
}
