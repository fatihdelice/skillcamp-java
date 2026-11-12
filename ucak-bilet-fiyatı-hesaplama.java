import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int mesafe, yas, yolculukTipi;
        double normalTutar, yasIndirimi, indirimliTutar;
        double gidisDonusIndirimi, toplamTutar;

        System.out.print("Mesafeyi km türünden giriniz: ");
        mesafe = input.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        yas = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş): ");
        yolculukTipi = input.nextInt();

        if (mesafe > 0 && yas > 0 && (yolculukTipi == 1 || yolculukTipi == 2)) {

            // Normal bilet tutarı
            normalTutar = mesafe * 0.10;

            // Yaş indirimi
            if (yas < 12) {
                yasIndirimi = normalTutar * 0.50;
            } else if (yas <= 24) {
                yasIndirimi = normalTutar * 0.10;
            } else if (yas > 65) {
                yasIndirimi = normalTutar * 0.30;
            } else {
                yasIndirimi = 0;
            }

            // Yaş indirimi uygulandıktan sonraki tutar
            indirimliTutar = normalTutar - yasIndirimi;

            // Gidiş dönüş indirimi
            if (yolculukTipi == 2) {
                gidisDonusIndirimi = indirimliTutar * 0.20;
                toplamTutar = (indirimliTutar - gidisDonusIndirimi) * 2;
            } else {
                toplamTutar = indirimliTutar;
            }

            System.out.println("Toplam Tutar = " + toplamTutar + " TL");

        } else {
            System.out.println("Hatalı Veri Girdiniz !");
        }

        input.close();
    }
}
