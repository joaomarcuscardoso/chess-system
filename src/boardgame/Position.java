package src.boardgame;

public class Position {
    private int row;
    private int column;

    public Position(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return this.row;
    }

    public boolean setRow(int row) {
        if (row > 0) {
            this.row = row;
            return true;
        } else {
            return false;

        }
    }

    public int getColumn() {
        return this.column;
    }

    public boolean setColumn(int column) {
        if (column > 0) {
            this.column = column;
            return true;
        } else {
            return false;

        }
    }

    public void setValues(int row, int column) {
        this.row = row;
        this.column = column;
    }

    @Override
    public String toString() {
        return row + ", " + column;
    }

}
