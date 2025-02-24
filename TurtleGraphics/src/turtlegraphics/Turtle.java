package turtlegraphics;

import static turtlegraphics.Direction.*;

public class Turtle {

    private boolean penUp= true;
    private Direction direction = EAST;
    private Position position = new Position(0,0);


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
        return this.position;
    }


    public Position currentPosition( int row , int column) {
        position = new Position(row, column);
        return position;
    }


    public void moveForward( int moves) {
            if(direction == EAST) position.moveEast(moves);
            if(direction == SOUTH) position.moveSouth(moves);
            if(direction == WEST) position.moveWest(moves);
            if(direction == NORTH) position.moveNorth(moves);

    }


}



