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
        double a = dataScanner.readDouble();
        System.out.println("Enter point b:");
        double b = dataScanner.readDouble();
        System.out.println("Enter point h:");
        double h = dataScanner.readDouble();

        String[] table = task10Service.returnTableAsArrayOfStrings(a, b, h);
        System.out.printf("%-12s%s\n", "F(x)", "tg(x)");
        for (String s : table) {
            System.out.print(s);
        }
    }
}
