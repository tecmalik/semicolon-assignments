package sevensegmentdisplay;

public class SegmentE {
    private int row;
    private int column;

    public SegmentE(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public void turnOn(){
        for(int index = 0;index < 2; index++){
            row--;
        }
    }
   @Override
    public String toString() {
        return String.format("[%d,%d]", row, column);
   }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof SegmentE){
            SegmentE segmentE = (SegmentE) obj;
            return segmentE.row == row && segmentE.column == column;
        }
        return false;
    }
}
