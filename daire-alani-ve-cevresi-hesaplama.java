import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int r, a;
        double pi = 3.14, alan, cevre;

        Scanner input = new Scanner(System.in);

        System.out.println("Yaricapi giriniz: ");
        r = input.nextInt();

        System.out.println("Daire diliminin acisini giriniz: ");
        a = input.nextInt();

        alan = pi * r * r;
        cevre = 2 * pi * r;
        System.out.println("Dairenin alani: " + alan);
        System.out.println("Dairenin cevresi: " + cevre);
        System.out.println("Daire diliminin alani: " + ((pi * (r*r) * a )/ 360));


    }
}