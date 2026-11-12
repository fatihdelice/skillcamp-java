import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sayi;
        int toplam = 0;

        while (true) {

            System.out.print("Bir sayi giriniz: ");
            sayi = input.nextInt();

            if (sayi % 2 != 0) {
                break;
            }

            if (sayi % 2 == 0 && sayi % 4 == 0) {
                toplam += sayi;
            }
        }

        System.out.println("4'un kati olan cift sayilarin toplami: " + toplam);

        input.close();
    }
}
