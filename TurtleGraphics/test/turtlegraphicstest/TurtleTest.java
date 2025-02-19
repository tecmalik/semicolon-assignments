package turtlegraphicstest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import turtlegraphics.Turtle;

import static org.junit.jupiter.api.Assertions.*;
import static turtlegraphics.Direction.*;

public class TurtleTest {
    Turtle turtle;
    @BeforeEach
    public void startWith(){
        turtle = new Turtle();
    }
    @Test
    public void MyTurtlePenIsUpByDefaultTest(){
        assertTrue(turtle.isPenUp());
    }
    @Test
    public void MyTurtleCanMovePenDownTest(){
        assertTrue(turtle.isPenUp());
        turtle.movePenDown();
        assertFalse(turtle.isPenUp());
    }
    @Test
    public void MyTurtleCanMovePenDownAndMovePenBackUpTest(){
        assertTrue(turtle.isPenUp());
        turtle.movePenDown();
        assertFalse(turtle.isPenUp());
        turtle.movePenUp();
        assertTrue(turtle.isPenUp());
    }
    @Test
    public void TurtleDirectionIsEastByDefaultTest(){
        assertEquals(EAST, turtle.getDirection());
    }
  @Test
    public void TurtleDirectionCanTurnRightWhenDirectionISEastToSouthTest(){
        assertEquals(EAST, turtle.getDirection());
        turtle.turnRight();
        assertEquals(SOUTH, turtle.getDirection());

    }
    @Test
    public void TurtleDirectionCanTurnRightWhenDirectionIsSouthToWestTest() {
        assertEquals(EAST, turtle.getDirection());
        turtle.turnRight();
        assertEquals(SOUTH, turtle.getDirection());
        turtle.turnRight();
        assertEquals(WEST, turtle.getDirection());
    }
    @Test
    public void TurtleDirectionCanTurnRightWhenDirectionIsWestToEastTest(){
        assertEquals(EAST, turtle.getDirection());
        turtle.turnRight();
        assertEquals(SOUTH, turtle.getDirection());
        turtle.turnRight();
        assertEquals(WEST, turtle.getDirection());
        turtle.turnRight();
        assertEquals(NORTH, turtle.getDirection());
    }
    @Test
    public void TurtleDirectionCanTurnLeftWhenDirectionIsEastToNorthTest(){
        assertEquals(EAST, turtle.getDirection());
        turtle.turnLeft();
        assertEquals(NORTH, turtle.getDirection());
    }
    @Test
    public void TurtleDirectionCanTurnLeftWhenDirectionIsNorthToWestTest(){
        assertEquals(EAST, turtle.getDirection());
        turtle.turnLeft();
        assertEquals(NORTH, turtle.getDirection());
        turtle.turnLeft();
        assertEquals(WEST, turtle.getDirection());
    }
    @Test
    public void TurtleDirectionCanTurnLeftWhenDirectionIsWestToSouthTest(){
        assertEquals(EAST, turtle.getDirection());
        turtle.turnLeft();
        assertEquals(NORTH, turtle.getDirection());
        turtle.turnLeft();
        assertEquals(WEST, turtle.getDirection());
        turtle.turnLeft();
        assertEquals(SOUTH, turtle.getDirection());
    }
 @Test
    public void TurtleDirectionCanTurnLeftWhenDirectionIsSouthToEastTest(){
        assertEquals(EAST, turtle.getDirection());
        turtle.turnLeft();
        assertEquals(NORTH, turtle.getDirection());
        turtle.turnLeft();
        assertEquals(WEST, turtle.getDirection());
        turtle.turnLeft();
        assertEquals(SOUTH, turtle.getDirection());
        turtle.turnLeft();
        assertEquals(EAST, turtle.getDirection());
    }
    @Test
    public void TurtleCanMoveForwardWhenFacing_Tests(){
        assertEquals(EAST, turtle.getDirection());
        turtle.moveFoward(0,4);
        assertEquals(new position(0,4),turtle.currentPosition());

    }



}
