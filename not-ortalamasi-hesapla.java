import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;

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

        int topla = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = topla / 6.0;

        if (sonuc >= 60) {
            System.out.println("Tebrikler, sinifi geçtiniz! Ortalamaniz: " + sonuc);
        } else {
            System.out.println("Üzgünüz, sinifta kaldiniz. Ortalamaniz: " + sonuc);
        }
    }
}