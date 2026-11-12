import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner inp = new Scanner(System.in);

        System.out.println("Mat notunuzu giriniz: ");
        mat = inp.nextInt();

        System.out.println("Fizik notunuzu giriniz: ");
        fizik = inp.nextInt();
        
        System.out.println("Kimya notunuzu giriniz: ");
        kimya = inp.nextInt();

        System.out.println("Turkce notunuzu giriniz: ");
        turkce = inp.nextInt();

        System.out.println("Tarih notunuzu giriniz: ");
        tarih = inp.nextInt();

        System.out.println("Muzik notunuzu giriniz: ");
        muzik = inp.nextInt();

        int topla = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = topla / 6.0;

        if (sonuc >= 60) {
            System.out.println("Tebrikler, sınıfı geçtiniz! Ortalamanız: " + sonuc);
        } else {
            System.out.println("Üzgünüz, sınıfta kaldınız. Ortalamanız: " + sonuc);
        }
    }
}