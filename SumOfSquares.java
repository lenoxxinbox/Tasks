/* Составьте программу, которая вычисляет сумму квадратов чисел от 1 до введенного вами целого числа N */
import java.util.Scanner;
public class SumOfSquares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int numberN = scanner.nextInt();
        int result = 0;
        for (int num = 1; num <= numberN; num++)
            result += num * num;

        System.out.println("Сумма квадратов от 1 до целого числа " + numberN + " равна: " + result);
    }
}
