package sevensegmentdisplay;

public class SegmentD {
    private int row ;
    private int column ;

    public SegmentD(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public void turnOn(char[][] board){
        for(int index = 0; index < 3; index++){
            board[this.row][this.column] = '#';
            this.column--;
        }
    }
    @Override
    public String toString() {
        return "SegmentD [row=" + row + ", column=" + column + "]";
    }
    @Override
    public boolean equals(Object obj) {
        SegmentD other = (SegmentD) obj;
        if(this.row == other.row && this.column == other.column){
            return true;
        }
        return false;
    }

}
