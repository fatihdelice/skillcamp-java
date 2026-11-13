import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};

        Scanner input = new Scanner(System.in);

        int min = list[0];
        int max = list[0];

        System.out.print("Bir sayi giriniz: ");
        int number = input.nextInt();

        int smaller = Integer.MIN_VALUE;
        int larger = Integer.MAX_VALUE;

        for (int i : list) {
            if (i < min) {
                min = i;
            }

            if (i > max) {
                max = i;
            }

            if (i < number && i > smaller) {
                smaller = i;
            }

            if (i > number && i < larger) {
                larger = i;
            }
        }

        System.out.println("Minimum Deger: " + min);
        System.out.println("Maximum Deger: " + max);

        if (smaller == Integer.MIN_VALUE) {
            System.out.println("Girilen sayidan kucuk eleman bulunamadi.");
        } else {
            System.out.println("Girilen sayidan kucuk en yakin sayi: " + smaller);
        }

        if (larger == Integer.MAX_VALUE) {
            System.out.println("Girilen sayidan buyuk eleman bulunamadi.");
        } else {
            System.out.println("Girilen sayidan buyuk en yakin sayi: " + larger);
        }

        input.close();
    }
}
