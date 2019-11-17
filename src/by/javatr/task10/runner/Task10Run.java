package by.javatr.task10.runner;

//Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h.
//Результат представить в виде таблицы, первый столбец которой – значения аргумента,
//второй - соответствующие значения функции.
//                                F(x) = tg(x);

import by.javatr.scanner.DataScanner;
import by.javatr.task10.util.Task10Service;

/**
 * @author Aleh Yemelyanchyk on 11/16/2019.
 */
public class Task10Run {
    private static DataScanner dataScanner = new DataScanner();
    private static Task10Service task10Service = new Task10Service();

    public static void main(String[] args) {
        System.out.println("Enter point a:");
        double a = dataScanner.readInteger();
        System.out.println("Enter point b:");
        double b = dataScanner.readInteger();
        System.out.println("Enter point h:");
        double h = dataScanner.readInteger();

        System.out.printf("%-12s%s\n", "F(x)", "x");
        while (a < b) {
            System.out.printf("%-12.4f%.2f\n", task10Service.countFunctionF(a), a);
            a += h;
        }
    }
}
