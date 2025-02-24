package sevensegmentdisplay;

public class SegmentF {
    private int row;
    private int column;

    public SegmentF(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public void turnOn(){
        for (int index = 0 ; index < 2; index++){
            row--;
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
