public class MultiplicationTable {
    public static void main(String[] args) {
        MultiplicationTable.prinMultiplicationTable();
    }
    public static void prinMultiplicationTable() {
        for (int num = 1; num < 11; num++) {
            System.out.println("Умножение на " + num + ":");
            System.out.println("");
            for (int item = 1; item < 11; item++) {
                System.out.println(num + " * " + item + " = " + num * item);
            }
            System.out.println("");
        }
    }
}
