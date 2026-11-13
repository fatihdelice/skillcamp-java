public class Player {
    private int openedCount;

    public Player() {
        openedCount = 0;
    }

    public void openCell(Minefield minefield, int row, int column) {
        minefield.openCell(row, column);
        openedCount++;
    }

    public int getOpenedCount() {
        return openedCount;
    }
}
