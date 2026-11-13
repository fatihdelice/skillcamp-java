import java.util.Random;

public class Minefield {
    private int row;
    private int column;
    private int mineCount;

    private String[][] mineMap;
    private String[][] gameMap;

    public Minefield(int row, int column) {
        this.row = row;
        this.column = column;
        this.mineCount = (row * column) / 4;

        mineMap = new String[row][column];
        gameMap = new String[row][column];

        createMap();
        createMines();
    }

    private void createMap() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                mineMap[i][j] = "-";
                gameMap[i][j] = "-";
            }
        }
    }

    private void createMines() {
        Random random = new Random();
        int placedMines = 0;

        while (placedMines < mineCount) {
            int mineRow = random.nextInt(row);
            int mineColumn = random.nextInt(column);

            if (!mineMap[mineRow][mineColumn].equals("*")) {
                mineMap[mineRow][mineColumn] = "*";
                placedMines++;
            }
        }
    }

    public boolean isInside(int selectedRow, int selectedColumn) {
        return selectedRow >= 0 && selectedRow < row
                && selectedColumn >= 0 && selectedColumn < column;
    }

    public boolean isOpened(int selectedRow, int selectedColumn) {
        return !gameMap[selectedRow][selectedColumn].equals("-");
    }

    public boolean isMine(int selectedRow, int selectedColumn) {
        return mineMap[selectedRow][selectedColumn].equals("*");
    }

    public int countMines(int selectedRow, int selectedColumn) {
        int count = 0;

        for (int i = selectedRow - 1; i <= selectedRow + 1; i++) {
            for (int j = selectedColumn - 1; j <= selectedColumn + 1; j++) {
                if (isInside(i, j) && mineMap[i][j].equals("*")) {
                    count++;
                }
            }
        }

        return count;
    }

    public void openCell(int selectedRow, int selectedColumn) {
        int mineAround = countMines(selectedRow, selectedColumn);
        gameMap[selectedRow][selectedColumn] = String.valueOf(mineAround);
    }

    public int getSafeCellCount() {
        return (row * column) - mineCount;
    }

    public void printGameMap() {
        printMap(gameMap);
    }

    public void printMineMap() {
        printMap(mineMap);
    }

    private void printMap(String[][] map) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}
