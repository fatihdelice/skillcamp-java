import java.util.Scanner;

public class MineSweeper {
    private Minefield minefield;
    private Player player;
    private Scanner input;

    public MineSweeper() {
        input = new Scanner(System.in);
        player = new Player();

        int row;
        int column;

        while (true) {
            System.out.print("Satir sayisini giriniz: ");
            row = input.nextInt();

            System.out.print("Sutun sayisini giriniz: ");
            column = input.nextInt();

            if (row >= 2 && column >= 2) {
                break;
            }

            System.out.println("Matris boyutu en az 2x2 olmalidir!");
        }

        minefield = new Minefield(row, column);
    }

    public void run() {
        System.out.println("===========================");
        System.out.println("Mayin Tarlasi Oyununa Hosgeldiniz!");
        System.out.println("===========================");

        minefield.printGameMap();

        while (player.getOpenedCount() < minefield.getSafeCellCount()) {
            int selectedRow;
            int selectedColumn;

            System.out.print("Satir Giriniz: ");
            selectedRow = input.nextInt();

            System.out.print("Sutun Giriniz: ");
            selectedColumn = input.nextInt();

            if (!minefield.isInside(selectedRow, selectedColumn)) {
                System.out.println("Gecersiz koordinat! Tekrar deneyiniz.");
                continue;
            }

            if (minefield.isOpened(selectedRow, selectedColumn)) {
                System.out.println("Bu koordinat daha once secildi, baska bir koordinat girin.");
                continue;
            }

            if (minefield.isMine(selectedRow, selectedColumn)) {
                System.out.println("Game Over!!");
                minefield.printMineMap();
                return;
            }

            player.openCell(minefield, selectedRow, selectedColumn);

            System.out.println("===========================");
            minefield.printGameMap();
        }

        System.out.println("Oyunu Kazandiniz!");
        System.out.println("===========================");
        minefield.printGameMap();
    }

    public static void main(String[] args) {
        MineSweeper game = new MineSweeper();
        game.run();
    }
}
