import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci sayiyi giriniz: ");
        int number1 = input.nextInt();

        System.out.print("Ikinci sayiyi giriniz: ");
        int number2 = input.nextInt();

        int ebob = 1;
        int i = 1;

        // EBOB hesaplama
        while (i <= number1 && i <= number2) {
            if (number1 % i == 0 && number2 % i == 0) {
                ebob = i;
            }
            i++;
        }

        // EKOK hesaplama
        int ekok = (number1 * number2) / ebob;

        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);

        input.close();
    }
}
