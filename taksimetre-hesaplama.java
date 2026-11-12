import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km;
        double perKm = 2.20, total, startPrice = 10;

        Scanner input = new Scanner(System.in);
        System.out.println("Mesafeyi km cinsinden giriniz: ");
        km = input.nextInt();
        total = startPrice + (km * perKm);
        System.out.println("Toplam Tutar: " + total);

        total = (total < 20) ? 20 : total;
        System.out.println("Odenecek Tutar: " + total);

    }
}