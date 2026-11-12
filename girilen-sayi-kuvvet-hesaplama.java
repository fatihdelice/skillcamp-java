import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sayi;
        int kuvvet = 1;

        System.out.print("Bir sayi giriniz: ");
        sayi = input.nextInt();

        System.out.println("4'un kuvvetleri:");

        while (kuvvet <= sayi) {
            System.out.println(kuvvet);
            kuvvet *= 4;
        }

        kuvvet = 1;

        System.out.println("5'in kuvvetleri:");

        while (kuvvet <= sayi) {
            System.out.println(kuvvet);
            kuvvet *= 5;
        }

        input.close();
    }
}
