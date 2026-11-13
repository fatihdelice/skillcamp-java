import java.util.Scanner;

public class Main {

    static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }

        return base * power(base, exponent - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Taban degerini giriniz: ");
        int base = scan.nextInt();

        System.out.print("Us degerini giriniz: ");
        int exponent = scan.nextInt();

        int result = power(base, exponent);

        System.out.println("Sonuc: " + result);

        scan.close();
    }
}
