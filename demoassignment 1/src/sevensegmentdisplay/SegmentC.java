package sevensegmentdisplay;

import java.util.Objects;

public class SegmentC {
    private int row;
    private int column;

    public SegmentC(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public void turnOn(){
        for(int index = 0; index < 2; index++){
            this.row++;
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
