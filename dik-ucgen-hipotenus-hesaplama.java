import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a, b, c;

        Scanner input = new Scanner(System.in);

        System.out.println("Dik ucgenin dik kenarlarini giriniz: ");
        System.out.print("Birinci dik kenar: ");
        a = input.nextDouble();
        System.out.print("Ikinci dik kenar: ");
        b = input.nextDouble();

        c = Math.sqrt((a * a) + (b * b));

        System.out.println("Hipotenüs: " + c);
        System.out.println("Dik ucgenin alani: " + (a * b) / 2);
        
    }
}