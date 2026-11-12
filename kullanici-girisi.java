import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String username, password;
        Scanner input = new Scanner(System.in);
        System.out.println("Kullanici adi: ");
        username = input.nextLine();

        System.out.println("Sifre: ");
        password = input.nextLine();

        if (username.equals("admin") && password.equals("12345")) {
            System.out.println("Giris basarili!");
        } else {
            System.out.println("Giris basarisiz! Şifrenizi sifirlamak ister misiniz? (E/H)");
            String reset = input.nextLine();
            if (reset.equalsIgnoreCase("E")) {
                System.out.println("Yeni sifreyi giriniz: ");
                String newPassword = input.nextLine();
                if (newPassword.equals("12345")) {
                    System.out.println("Sifre olusturulamadi, lutfen baska sifre giriniz.");
                } else {
                    System.out.println("Sifre olusturuldu.");
                }
            } else {
                System.out.println("Sifre sifirlamasi iptal edildi.");
            }
        }
                
    }
}