import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sayi;
        int toplam = 0;
        int adet = 0;

        System.out.print("Bir sayi giriniz: ");
        sayi = input.nextInt();

        for (int i = 0; i <= sayi; i++) {

            if (i % 3 == 0 && i % 4 == 0) {
                toplam += i;
                adet++;
            }
        }

        if (adet > 0) {
            double ortalama = (double) toplam / adet;
            System.out.println("3 ve 4'e tam bolunen sayilarin ortalamasi: " + ortalama);
        } else {
            System.out.println("Kosula uygun sayi bulunamadi!");
        }

        input.close();
    }
}
