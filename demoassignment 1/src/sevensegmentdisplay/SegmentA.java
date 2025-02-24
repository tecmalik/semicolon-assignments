package sevensegmentdisplay;

public class SegmentA {
    private int row = 0;
    private int column = 0;

    SegmentA(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public void turnOn() {
        for(int index = 0; index < 3; index++) {
            this.column++;
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
