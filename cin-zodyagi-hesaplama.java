import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int dogumYili;
        int kalan;

        System.out.print("Dogum Yilinizi Giriniz: ");
        dogumYili = input.nextInt();

        if (dogumYili > 0) {

            kalan = dogumYili % 12;

            if (kalan == 0) {
                System.out.println("Çin Zodyagi Burcunuz: Maymun");
            } else if (kalan == 1) {
                System.out.println("Çin Zodyagi Burcunuz: Horoz");
            } else if (kalan == 2) {
                System.out.println("Çin Zodyagi Burcunuz: Köpek");
            } else if (kalan == 3) {
                System.out.println("Çin Zodyagi Burcunuz: Domuz");
            } else if (kalan == 4) {
                System.out.println("Çin Zodyagi Burcunuz: Fare");
            } else if (kalan == 5) {
                System.out.println("Çin Zodyagi Burcunuz: Öküz");
            } else if (kalan == 6) {
                System.out.println("Çin Zodyagi Burcunuz: Kaplan");
            } else if (kalan == 7) {
                System.out.println("Çin Zodyagi Burcunuz: Tavşan");
            } else if (kalan == 8) {
                System.out.println("Çin Zodyagi Burcunuz: Ejderha");
            } else if (kalan == 9) {
                System.out.println("Çin Zodyagi Burcunuz: Yilan");
            } else if (kalan == 10) {
                System.out.println("Çin Zodyagi Burcunuz: At");
            } else if (kalan == 11) {
                System.out.println("Çin Zodyagi Burcunuz: Koyun");
            }

        } else {
            System.out.println("Gecersiz dogum yili girdiniz!");
        }

        input.close();
    }
}
