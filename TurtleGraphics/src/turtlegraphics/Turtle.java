package turtlegraphics;

import static turtlegraphics.Direction.*;

public class Turtle {

    private Boolean penUp;
    private Direction direction;
    private Position position;

    public Turtle() {
        position = new Position(0,0);
        this.penUp = true;
        this.direction = EAST;
    }


    public void movePenUp() {
        penUp = true;
    }
    public boolean isPenUp(){
        return penUp;
    }
    public void movePenDown() {
        penUp = false;
    }


    public Direction getDirection() {
        return direction;
    }

    public void turnRight() {
        switch (direction) {
            case EAST-> turn(SOUTH);
            case SOUTH -> turn(WEST);
            case WEST -> turn(NORTH);
            case NORTH -> turn(EAST);
        }
    }

    private void turn(Direction newDirection) {
        this.direction = newDirection;
    }

    public void turnLeft() {
        switch (direction) {
            case EAST -> turn(NORTH);
            case NORTH -> turn(WEST);
            case WEST -> turn(SOUTH);
            case SOUTH -> turn(EAST);

        }
    }

    public Position currentPosition() {
        return position;
    }


    public Position currentPosition( int row , int column) {
        position = new Position(row, column);
        return position;
    }


    public void moveForward(int i, int i1) {
    }
}



