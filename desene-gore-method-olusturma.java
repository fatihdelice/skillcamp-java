import java.util.Scanner;

public class Main {

    static void pattern(int number, int originalNumber, boolean subtract) {
        System.out.print(number + " ");

        if (number <= 0) {
            subtract = false;
        }

        if (!subtract && number == originalNumber) {
            return;
        }

        if (subtract) {
            pattern(number - 5, originalNumber, true);
        } else {
            pattern(number + 5, originalNumber, false);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("N Sayisi: ");
        int n = scan.nextInt();

        pattern(n, n, true);

        scan.close();
    }
}
