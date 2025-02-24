package sevensegmentdisplay;

public class SegmentG {
    private int row;
    private int column ;

    public SegmentG(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public void turnOn(){
        for (int index = 0 ; index < 3; index++){
            column++;
        }
    }

    @Override
    public String toString() {
        return String.format("[%d,%d]", row, column);
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof SegmentG){
            SegmentG seg = (SegmentG) obj;
            return row == seg.row && column == seg.column;
        }
        return false;
    }

}