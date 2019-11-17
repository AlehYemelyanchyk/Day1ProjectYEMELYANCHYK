package by.javatr.task6.runner;

//6. Идет n-я секунда суток, определить, сколько полных часов, полных минут и секунд прошло
//к этому моменту.

import by.javatr.scanner.DataScanner;
import by.javatr.task6.util.Task6Service;

/**
 * @author Aleh Yemelyanchyk on 11/16/2019.
 */
public class Task6Run {
    private static DataScanner dataScanner = new DataScanner();
    private static Task6Service task6Service = new Task6Service();

    public static void main(String[] args) {
        System.out.println("Enter seconds from 0 to 86400:");
        int seconds = dataScanner.readInteger();
        System.out.println("Full hours: " + task6Service.countFullHoursPass(seconds));
        System.out.println("Full minutes: " + task6Service.countFullMinutesPass(seconds));
        System.out.println("Full seconds: " + task6Service.countFullSecondsPass(seconds));
    }
}
