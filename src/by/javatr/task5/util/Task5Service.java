package by.javatr.task5.util;

/**
 * @author Aleh Yemelyanchyk on 11/16/2019.
 */
public class Task5Service {
    public boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int sum = 0;
        int divider = 1;
        while (divider < number) {
            if (number % divider == 0) {
                sum += divider;
            }
            divider++;
        }
        return sum == number;
    }
}
