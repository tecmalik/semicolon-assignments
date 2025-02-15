package turtlegraphics;

import static turtlegraphics.Direction.*;

public class Turtle {
    private Boolean penState = true;
    private Direction direction = EAST;

    public void movePenUp() {
        penState = true;
    }
    public boolean isPenUp(){
        return penState;
    }
    public void movePenDown() {
        penState = false;
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
}
