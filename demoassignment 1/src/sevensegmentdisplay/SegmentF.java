package sevensegmentdisplay;

public class SegmentF {
    private int row;
    private int column;

    public SegmentF(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public void turnOn(char[][] board){
        for (int index = 0 ; index < 2; index++){
            board[this.row][this.column] = '#';
            this.row--;
            board[this.row][this.column] = '#';
        }
    }
   @Override
    public String toString() {
        return String.format("(%d,%d)", row, column);
   }
   @Override
    public boolean equals(Object obj) {
        if (obj instanceof SegmentF){
            SegmentF other = (SegmentF) obj;
            return row == other.row && column == other.column;
        }
        return false;
   }
}
