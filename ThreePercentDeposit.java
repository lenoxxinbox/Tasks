/* В сберкассу на трехпроцентный вклад положили S рублей. 
Какой станет сумма вклада через N лет? */

import java.util.Scanner;
public class ThreePercentDeposit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму депозита: ");
        int sumDeposit = scanner.nextInt();
        System.out.print("Введите количество лет: ");
        int period = scanner.nextInt();

        int result = sumDeposit + period * ((sumDeposit * 3) / 100);
        System.out.println("Сумма вклада через " + period + " лет: " + result);
    }
}
