/* В бригаде, работающей на уборке сена, имеется N сенокосилок. Первая сенокосилка
* работала m часов, каждая следующая на 10 минут больше, чем предыдущая. Сколько часов
* проработала вся бригада? */

import java.util.Scanner;
public class HayMowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество сенокосилок: ");
        int hayMowers = scanner.nextInt();
        System.out.print("Введите какое количество часов работала первая сенокосилка: ");
        int m  = scanner.nextInt();
        int timeWork = 60 * m;
        int totalTime = 0;
        int nextWork = timeWork;
        for (int num = 1; num < hayMowers; num ++) {
            nextWork += 10;
            totalTime += nextWork;
        }
        int result = totalTime  + timeWork;
        double resultHours = result / 60;

        System.out.println("Итого брагада отработала: " + result + " минут");
        System.out.println("Итого брагада отработала: " + resultHours + " часов");
    }
}
