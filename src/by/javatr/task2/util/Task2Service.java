package by.javatr.task2.util;

/**
 * @author Aleh Yemelyanchyk on 11/14/2019.
 */
public class Task2Service {

    private final int JANUARY = 1;
    private final int FEBRUARY = 2;
    private final int MARCH = 3;
    private final int APRIL = 4;
    private final int MAY = 5;
    private final int JUNE = 6;
    private final int JULY = 7;
    private final int AUGUST = 8;
    private final int SEPTEMBER = 9;
    private final int OCTOBER = 10;
    private final int NOVEMBER = 11;
    private final int DECEMBER = 12;

    public int takeDaysInMonth(int month, int year) {
        if ((month >= 1 && month <= 12) && (year >= 1 && year <= 9999)) {
            switch (month) {
                case JANUARY:
                case MARCH:
                case MAY:
                case JULY:
                case AUGUST:
                case OCTOBER:
                case DECEMBER:
                    return 31;
                case FEBRUARY:
                    if (isLeapYear(year)) {
                        return 29;
                    } else {
                        return 28;
                    }
                case APRIL:
                case JUNE:
                case SEPTEMBER:
                case NOVEMBER:
                    return 30;
            }
        }
        return -1;
    }

    private boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 100 != 0) {
            return true;
        } else return year % 400 == 0;
    }
}
