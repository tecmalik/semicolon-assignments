package turtlegraphics;

public class Position {
    private int row;
    private int column;

    public Position(int row, int column) {
        this.row = row;
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

    public void moveEast(int steps) {
        for(int moves = 0; moves < steps; moves++) {
            this.column++;
        }
    }

    @Override
    public String toString() {
        return "Position [row:" + row + ", column:" + column + "]";
    }

    public void moveSouth(int moves) {
        for(int step = 0; step < moves; step++) {
            this.row++;
        }
    }

    public void moveWest(int moves) {
        for(int step = 0; step < moves; step++) {
            this.column--;
        }
    }

    public void moveNorth(int moves) {
        for(int step = 0; step < moves; step++) {
            this.row--;
        }
    }
}
