import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00, toplam;

        Scanner input = new Scanner(System.in);

        System.out.println("Armut kac kilo? ");
        double armutKilo = input.nextDouble();

        System.out.println("Elma kac kilo? ");
        double elmaKilo = input.nextDouble();

        System.out.println("Domates kac kilo? ");
        double domatesKilo = input.nextDouble();

        System.out.println("Muz kac kilo? ");
        double muzKilo = input.nextDouble();

        System.out.println("Patlican kac kilo? ");
        double patlicanKilo = input.nextDouble();

        toplam = (armut * armutKilo) + (elma * elmaKilo) + (domates * domatesKilo) + (muz * muzKilo) + (patlican * patlicanKilo);
        System.out.println("Toplam tutar: " + toplam);

    }
}