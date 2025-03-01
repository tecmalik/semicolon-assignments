package sevensegmentdisplay;

public class SegmentA {
    private int row ;
    private int column ;

    SegmentA(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public void turnOn(char[][] board) {

        for(int index = 0; index < 3; index++) {
            board[row][column] = '#';
            column++;
        }
    }
    @Override
    public String toString() {
        return "row : " + row + ", column : " + column;
    }
    @Override
    public boolean equals(Object obj) {
        SegmentA sa = (SegmentA) obj;
        return this.row == sa.row && this.column == sa.column;
    }

}
