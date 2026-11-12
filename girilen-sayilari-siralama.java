import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayi1, sayi2, sayi3;
        int kucuk, orta, buyuk;

        System.out.print("1. sayıyı giriniz: ");
        sayi1 = input.nextInt();

        System.out.print("2. sayıyı giriniz: ");
        sayi2 = input.nextInt();

        System.out.print("3. sayıyı giriniz: ");
        sayi3 = input.nextInt();

        // Küçükten büyüğe sıralama
        if (sayi1 <= sayi2 && sayi1 <= sayi3) {
            kucuk = sayi1;

            if (sayi2 <= sayi3) {
                orta = sayi2;
                buyuk = sayi3;
            } else {
                orta = sayi3;
                buyuk = sayi2;
            }

        } else if (sayi2 <= sayi1 && sayi2 <= sayi3) {
            kucuk = sayi2;

            if (sayi1 <= sayi3) {
                orta = sayi1;
                buyuk = sayi3;
            } else {
                orta = sayi3;
                buyuk = sayi1;
            }

        } else {
            kucuk = sayi3;

            if (sayi1 <= sayi2) {
                orta = sayi1;
                buyuk = sayi2;
            } else {
                orta = sayi2;
                buyuk = sayi1;
            }
        }

        // Sonuçları yazdırma
        System.out.println("\nKüçükten büyüğe: " 
                + kucuk + " < " + orta + " < " + buyuk);

        System.out.println("Büyükten küçüğe: " 
                + buyuk + " > " + orta + " > " + kucuk);

        input.close();
    }
}
