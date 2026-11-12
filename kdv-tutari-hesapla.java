import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar, kdvOrani = 0.18, kdvTutari, kdvliTutar;

        Scanner input = new Scanner(System.in);

        System.out.println("Urun tutarini giriniz: ");
        tutar = input.nextDouble();

        kdvTutari = tutar * kdvOrani;
        kdvliTutar = tutar + kdvTutari;

        System.out.println("KDV Tutari: " + kdvTutari);
        System.out.println("KDV'li Tutar: " + kdvliTutar);

        if (tutar < 1000) {
            System.out.println("KDV Orani: %18");
        } else {
            System.out.println("KDV Orani: %8");
        }
    }
}