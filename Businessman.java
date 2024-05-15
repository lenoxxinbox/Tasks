/* Бизнессмен взял ссуду м тысяч рублей в банке под 20% годовых.
* через сколько лет его долг превысит s тысяч рублей, если он за это время не будет отдавать долг? */

import java.util.Scanner;

public class Businessman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму ссуды в тысячах рублей: ");
        double loan = scanner.nextInt();
        System.out.print("Введите сумму долга в тысячах рублей: ");
        double debt = scanner.nextInt();
        double interestRate = 0.20;
        int years = 0;
        while (loan < debt) {
            double interest = loan * interestRate;
            loan = loan + interest;
            years++;
        }

        System.out.println("Долг превысит " + debt + " тысяч рублей через " + years + " лет");
    }
}
