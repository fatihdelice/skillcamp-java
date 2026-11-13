import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayi giriniz: ");
        int number = input.nextInt();

        int originalNumber = number;
        int reverseNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reverseNumber = reverseNumber * 10 + digit;
            number /= 10;
        }

        if (originalNumber == reverseNumber) {
            System.out.println(originalNumber + " palindrom sayidir.");
        } else {
            System.out.println(originalNumber + " palindrom sayi degildir.");
        }

        input.close();
    }
}