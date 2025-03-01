package sevensegmentdisplay;

public class SegmentB {
    private int row ;
    private int column ;

    public SegmentB(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public void turnOn(char[][] board){
        for(int index = 0 ; index < 2 ; index++){
            board[this.row][this.column] = '#';
            this.row++;
        }
    }
    @Override
    public String toString() {
        return "row : " + row + ", column : " + column;
    }

    @Override
    public boolean equals(Object obj) {
        SegmentB other = (SegmentB) obj;
        return this.row == other.row && this.column == other.column;
    }



}
