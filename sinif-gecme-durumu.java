import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;
        int topla = 0;
        int dersSayisi = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Mat notunuzu giriniz: ");
        mat = input.nextInt();

        System.out.println("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();

        System.out.println("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();

        System.out.println("Turkce notunuzu giriniz: ");
        turkce = input.nextInt();

        System.out.println("Tarih notunuzu giriniz: ");
        tarih = input.nextInt();

        System.out.println("Muzik notunuzu giriniz: ");
        muzik = input.nextInt();

        if (mat >= 0 && mat <= 100) {
            topla += mat;
            dersSayisi++;
        }

        if (fizik >= 0 && fizik <= 100) {
            topla += fizik;
            dersSayisi++;
        }

        if (kimya >= 0 && kimya <= 100) {
            topla += kimya;
            dersSayisi++;
        }

        if (turkce >= 0 && turkce <= 100) {
            topla += turkce;
            dersSayisi++;
        }

        if (tarih >= 0 && tarih <= 100) {
            topla += tarih;
            dersSayisi++;
        }

        if (muzik >= 0 && muzik <= 100) {
            topla += muzik;
            dersSayisi++;
        }

        if (dersSayisi > 0) {
            double sonuc = (double) topla / dersSayisi;

            if (sonuc >= 60) {
                System.out.println("Tebrikler, sinifi geçtiniz! Ortalamaniz: " + sonuc);
            } else {
                System.out.println("Üzgünüz, sinifta kaldiniz. Ortalamaniz: " + sonuc);
            }
        } else {
            System.out.println("Geçerli bir not girilmedi!");
        }

        input.close();
    }
}
