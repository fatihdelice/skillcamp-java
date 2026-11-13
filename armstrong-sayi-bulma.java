import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayi Giriniz: ");
        int number = input.nextInt();

        int tempNumber = Math.abs(number);
        int basNumber = 0;
        int result = 0;
        int armstrongResult = 0;

        // Basamak sayisini bulma
        int temp = tempNumber;

        if (temp == 0) {
            basNumber = 1;
        }

        while (temp != 0) {
            temp /= 10;
            basNumber++;
        }

        // Basamaklarin toplamini ve Armstrong degerini hesaplama
        tempNumber = Math.abs(number);

        while (tempNumber != 0) {
            int basValue = tempNumber % 10;

            // Basamaklarin toplami
            result += basValue;

            // Basamagin ussunu hesaplama
            int basPow = 1;

            for (int i = 1; i <= basNumber; i++) {
                basPow *= basValue;
            }

            armstrongResult += basPow;

            tempNumber /= 10;
        }

        // Sifir icin Armstrong kontrolu
        if (number == 0) {
            armstrongResult = 0;
        }

        System.out.println("Basamaklar toplami: " + result);

        if (number >= 0 && armstrongResult == number) {
            System.out.println(number + " sayisi bir Armstrong sayidir.");
        } else {
            System.out.println(number + " sayisi bir Armstrong sayisi degildir.");
        }

        input.close();
    }
}
