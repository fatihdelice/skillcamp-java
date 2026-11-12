import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n, r;
        long nFaktoriyel = 1;
        long rFaktoriyel = 1;
        long nrFaktoriyel = 1;

        System.out.print("N sayisini giriniz: ");
        n = input.nextInt();

        System.out.print("R sayisini giriniz: ");
        r = input.nextInt();

        if (n >= 0 && r >= 0 && n >= r) {

            // N faktoriyel hesaplama
            for (int i = 1; i <= n; i++) {
                nFaktoriyel *= i;
            }

            // R faktoriyel hesaplama
            for (int i = 1; i <= r; i++) {
                rFaktoriyel *= i;
            }

            // (N-R) faktoriyel hesaplama
            for (int i = 1; i <= (n - r); i++) {
                nrFaktoriyel *= i;
            }

            // Kombinasyon hesaplama C(n,r) = n! / (r! * (n-r)!)
            long kombinasyon = nFaktoriyel / (rFaktoriyel * nrFaktoriyel);

            System.out.println("C(" + n + "," + r + ") = " + kombinasyon);

        } else {
            System.out.println("Hatali deger girdiniz!");
        }

        input.close();
    }
}
