import java.util.Scanner;

public class Main {

    static boolean isPrime(int number, int divisor) {
        if (number < 2) {
            return false;
        }

        if (divisor > Math.sqrt(number)) {
            return true;
        }

        if (number % divisor == 0) {
            return false;
        }

        return isPrime(number, divisor + 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Sayi Giriniz: ");
        int number = scan.nextInt();

        if (isPrime(number, 2)) {
            System.out.println(number + " sayisi ASALDIR !");
        } else {
            System.out.println(number + " sayisi ASAL degildir !");
        }

        scan.close();
    }
}
