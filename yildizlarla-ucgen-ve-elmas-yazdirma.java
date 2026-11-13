import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir Sayi Giriniz: ");
        int n = input.nextInt();

        // Ucgen cizimi
        System.out.println("\nUcgen:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n - i - 1); j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Elmas cizimi
        System.out.println("\nElmas:");

        // Elmasin ust kismi
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n - i - 1); j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Elmasin alt kismi
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < (n - i - 1); j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        input.close();
    }
}
