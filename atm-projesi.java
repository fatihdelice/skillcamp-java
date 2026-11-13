import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);

        int right = 3;
        int balance = 1500;
        int select;

        while (right > 0) {
            System.out.print("Kullanici Adiniz: ");
            userName = input.nextLine();

            System.out.print("Parolaniz: ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasina Hosgeldiniz!");

                do {
                    System.out.println("\n1- Para Yatirma");
                    System.out.println("2- Para Cekme");
                    System.out.println("3- Bakiye Sorgula");
                    System.out.println("4- Cikis Yap");

                    System.out.print("Lutfen yapmak istediginiz islemi seciniz: ");
                    select = input.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("Para miktari: ");
                            int deposit = input.nextInt();

                            if (deposit > 0) {
                                balance += deposit;
                                System.out.println("Para yatirma islemi basarili.");
                            } else {
                                System.out.println("Gecersiz para miktari.");
                            }
                            break;

                        case 2:
                            System.out.print("Para miktari: ");
                            int withdraw = input.nextInt();

                            if (withdraw <= 0) {
                                System.out.println("Gecersiz para miktari.");
                            } else if (withdraw > balance) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                balance -= withdraw;
                                System.out.println("Para cekme islemi basarili.");
                            }
                            break;

                        case 3:
                            System.out.println("Bakiyeniz: " + balance + " TL");
                            break;

                        case 4:
                            System.out.println("Tekrar gorusmek uzere.");
                            break;

                        default:
                            System.out.println("Gecersiz islem secimi.");
                            break;
                    }

                } while (select != 4);

                break;

            } else {
                right--;

                System.out.println("Hatali kullanici adi veya sifre. Tekrar deneyiniz.");

                if (right == 0) {
                    System.out.println("Hesabiniz bloke olmustur. Lutfen banka ile iletisime geciniz.");
                } else {
                    System.out.println("Kalan hakkiniz: " + right);
                }
            }
        }

        input.close();
    }
}
