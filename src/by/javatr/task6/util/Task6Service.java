package by.javatr.task6.util;

/**
 * @author Aleh Yemelyanchyk on 11/16/2019.
 */
public class Task6Service {

    public int countFullHoursPass(int seconds) {
        if (!isValidSecond(seconds)) {
            return -1;
        }
        return seconds / 3600;
    }

    public int countFullMinutesPass(int seconds) {
        if (!isValidSecond(seconds)) {
            return -1;
        }
        seconds %= 3600;
        return seconds / 60;
    }

    public int countFullSecondsPass(int seconds) {
        if (!isValidSecond(seconds)) {
            return -1;
        }
        seconds %= 3600;
        seconds %= 60;
        return seconds;
    }

    private boolean isValidSecond(int second) {
        return second > 0 && second < (60 * 60 * 24);
    }
}


