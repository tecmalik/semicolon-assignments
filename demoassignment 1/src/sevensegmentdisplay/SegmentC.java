package sevensegmentdisplay;

public class SegmentC {
    private int row;
    private int column;

    public SegmentC(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public void turnOn(char[][] board){
        for(int index = 0; index < 2; index++){
            board[this.row][this.column] = '#';
            this.row++;
            board[this.row][this.column] = '#';
        }
    }


    @Override
    public String toString() {
        return "SegmentC [row=" + row + ", column=" + column + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof SegmentC) {
            SegmentC other = (SegmentC) obj;
            return this.row == other.row && this.column == other.column;
        }
        return false;
    }
}
