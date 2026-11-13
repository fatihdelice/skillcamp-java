import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Dizinin boyutu n: ");
        int n = input.nextInt();

        int[] numbers = new int[n];

        System.out.println("Dizinin elemanlarini giriniz:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print((i + 1) + ". Elemani: ");
            numbers[i] = input.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        System.out.print("Siralamasi: ");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        input.close();
    }
}
