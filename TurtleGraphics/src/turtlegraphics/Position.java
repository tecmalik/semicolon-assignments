package turtlegraphics;

public class Position {
    private int row;
    private int column;

    public Position(int xCoordinate, int column) {
        this.row = xCoordinate;
        this.column = column;
    }


    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Position) {
            Position p = (Position)obj;
            return this.row == p.row && this.column == p.column;
        }
        return false;
    }

    public void increaseColumn(int steps) {
        for(int moves = 0; moves < steps; moves++) {
            this.column++;
        }
    }

    @Override
    public String toString() {
        return "Position [row:" + row + ", column:" + column + "]";
    }

}
