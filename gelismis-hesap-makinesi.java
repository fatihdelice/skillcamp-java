import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    static void plus() {
        int number, result = 0, i = 1;

        while (true) {
            System.out.print(i++ + ". sayi (Bitirmek icin 0): ");
            number = scan.nextInt();

            if (number == 0) {
                break;
            }

            result += number;
        }

        System.out.println("Sonuc: " + result);
    }

    static void minus() {
        System.out.print("Kac adet sayi gireceksiniz: ");
        int counter = scan.nextInt();

        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayi: ");
            number = scan.nextInt();

            if (i == 1) {
                result = number;
            } else {
                result -= number;
            }
        }

        System.out.println("Sonuc: " + result);
    }

    static void times() {
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i++ + ". sayi (Bitirmek icin 1): ");
            number = scan.nextInt();

            if (number == 1) {
                break;
            }

            result *= number;
        }

        System.out.println("Sonuc: " + result);
    }

    static void divided() {
        System.out.print("Kac adet sayi gireceksiniz: ");
        int counter = scan.nextInt();

        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayi: ");
            number = scan.nextDouble();

            if (i != 1 && number == 0) {
                System.out.println("Boleni 0 giremezsiniz.");
                i--;
                continue;
            }

            if (i == 1) {
                result = number;
            } else {
                result /= number;
            }
        }

        System.out.println("Sonuc: " + result);
    }

    static void power() {
        System.out.print("Taban degerini giriniz: ");
        int base = scan.nextInt();

        System.out.print("Us degerini giriniz: ");
        int exponent = scan.nextInt();

        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuc: " + result);
    }

    static void factorial() {
        System.out.print("Sayi giriniz: ");
        int n = scan.nextInt();

        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuc: " + result);
    }

    // Mod alma islemi
    static void mod() {
        System.out.print("Birinci sayiyi giriniz: ");
        int number1 = scan.nextInt();

        System.out.print("Ikinci sayiyi giriniz: ");
        int number2 = scan.nextInt();

        if (number2 == 0) {
            System.out.println("Sifira bolme yapilamaz.");
            return;
        }

        int result = number1 % number2;

        System.out.println("Mod sonucu: " + result);
    }

    // Dikdortgen alan ve cevre hesabi
    static void rectangle() {
        System.out.print("Kisa kenari giriniz: ");
        int shortSide = scan.nextInt();

        System.out.print("Uzun kenari giriniz: ");
        int longSide = scan.nextInt();

        int area = shortSide * longSide;
        int perimeter = 2 * (shortSide + longSide);

        System.out.println("Dikdortgenin alani: " + area);
        System.out.println("Dikdortgenin cevresi: " + perimeter);
    }

    public static void main(String[] args) {

        int select;

        String menu = "1- Toplama Islemi\n"
                + "2- Cikarma Islemi\n"
                + "3- Carpma Islemi\n"
                + "4- Bolme Islemi\n"
                + "5- Uslu Sayi Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdortgen Alan ve Cevre Hesabi\n"
                + "0- Cikis Yap";

        do {
            System.out.println("\n" + menu);
            System.out.print("Lutfen bir islem seciniz: ");
            select = scan.nextInt();

            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangle();
                    break;
                case 0:
                    System.out.println("Hesap makinesi kapatildi.");
                    break;
                default:
                    System.out.println("Yanlis bir deger girdiniz, tekrar deneyiniz.");
            }

        } while (select != 0);

        scan.close();
    }
}
