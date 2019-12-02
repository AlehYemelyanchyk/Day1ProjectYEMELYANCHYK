package by.javatr.task10.util;

/**
 * @author Aleh Yemelyanchyk on 11/16/2019.
 */
public class Task10Service {

    public String[] returnTableAsArrayOfStrings(double a, double b, double h) {
        int arraySize = (int) Math.ceil((b - a) / h);
        String[] arrayStrings = new String[arraySize];
        int index = 0;
        while (a < b) {
            arrayStrings[index++] = String.format("%-12.4f%.2f\n", countFunctionF(a), a);
            a += h;
        }
        return arrayStrings;
    }

    private double countFunctionF(double a) {
        return Math.tan(Math.toRadians(a));
    }
}
