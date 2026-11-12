import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int kilo;
        double vki, boy;

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        boy = input.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz: ");
        kilo = input.nextInt();

        vki = kilo / (boy * boy);
        System.out.println("Vücut kitle indeksiniz: " + vki);
        
    }
}