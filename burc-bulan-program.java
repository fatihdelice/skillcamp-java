import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ay, gun;

        System.out.print("Dogdugunuz ayi giriniz (1-12): ");
        ay = input.nextInt();

        System.out.print("Dogdugunuz gunu giriniz (1-31): ");
        gun = input.nextInt();

        if (ay < 1 || ay > 12 || gun < 1 || gun > 31) {
            System.out.println("Geçersiz tarih girdiniz!");
        } 
        else if ((ay == 3 && gun >= 21) || (ay == 4 && gun <= 20)) {
            System.out.println("Koc Burcu");
        } 
        else if ((ay == 4 && gun >= 21) || (ay == 5 && gun <= 21)) {
            System.out.println("Boga Burcu");
        } 
        else if ((ay == 5 && gun >= 22) || (ay == 6 && gun <= 22)) {
            System.out.println("İkizler Burcu");
        } 
        else if ((ay == 6 && gun >= 23) || (ay == 7 && gun <= 22)) {
            System.out.println("Yengec Burcu");
        } 
        else if ((ay == 7 && gun >= 23) || (ay == 8 && gun <= 22)) {
            System.out.println("Aslan Burcu");
        } 
        else if ((ay == 8 && gun >= 23) || (ay == 9 && gun <= 22)) {
            System.out.println("Basak Burcu");
        } 
        else if ((ay == 9 && gun >= 23) || (ay == 10 && gun <= 22)) {
            System.out.println("Terazi Burcu");
        } 
        else if ((ay == 10 && gun >= 23) || (ay == 11 && gun <= 21)) {
            System.out.println("Akrep Burcu");
        } 
        else if ((ay == 11 && gun >= 22) || (ay == 12 && gun <= 21)) {
            System.out.println("Yay Burcu");
        } 
        else if ((ay == 12 && gun >= 22) || (ay == 1 && gun <= 21)) {
            System.out.println("Oglak Burcu");
        } 
        else if ((ay == 1 && gun >= 22) || (ay == 2 && gun <= 19)) {
            System.out.println("Kova Burcu");
        } 
        else if ((ay == 2 && gun >= 20) || (ay == 3 && gun <= 20)) {
            System.out.println("Balik Burcu");
        }

        input.close();
    }
}
