/* задано натуральное число N. Найти количество натуральных чисел, не превосходящих N и не делящихся ни на одно из чисел 2, 3, 5 */

import java.util.Scanner;

public class QuantityNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        int naturalN = scanner.nextInt();
        int count = 0;
        for (int item = 1; item <= naturalN; item++) {
            if (item % 2 != 0 && item % 3 != 0 && item % 5 != 0) count++;
        }
        System.out.println("Количество натуральных чисел, не превосходящих " + naturalN + " и не делящихся ни на одно из чисел 2, 3, 5: " + count);
    }
}
