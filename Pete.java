/* У первоклассника Пети м рублей. Мороженое стоит к рублей.
* Петя решил наесться досыта мороженого, для этого он покупал по одному мороженому и съедал его до тех пор, пока ему хватало денег.
* Как Пете узнать, сколько денег останется у него в конце концов? Учтите, что Петя делить еще не умеет, а умеет только
* вычитать и складывать. Сколько мороженых он может съесть? */

import java.util.Scanner;

public class Pete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество рублей у Пети: ");
        int rubls = scanner.nextInt();
        System.out.print("Сколько стоит одно мороженое: ");
        int price = scanner.nextInt();
        int iceCreamsEaten = 0;
        while (rubls >= price) {
            rubls = rubls - price;
            iceCreamsEaten++;
        }
        System.out.println("Петя может съесть " + iceCreamsEaten + " мороженых");
        System.out.println("У Пети останется " + rubls + " рублей");
    }
}
