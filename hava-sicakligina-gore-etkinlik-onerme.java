import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sicaklik değerini giriniz: ");
        int sicaklik = input.nextInt();

        if (sicaklik < 5) {
            System.out.println("Kayak yapmayi öneriyoruz.");
        } else if (sicaklik >= 5 && sicaklik < 15) {
            System.out.println("Sinema etkinliğini öneriyoruz.");
        } else if (sicaklik >= 15 && sicaklik <= 25) {
            System.out.println("Piknik yapmayi öneriyoruz.");
        } else {
            System.out.println("Yüzmeye gitmeyi öneriyoruz.");
        }

        input.close();
    }
}
