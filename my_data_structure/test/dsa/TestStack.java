package dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestStack {
    private MyStack myStack;
    @BeforeEach
    public void testStack() {
        myStack = new MyStack();
    }
    @Test
    public void test_ifMyStackIsEmpty() {
        assertTrue(myStack.isEmpty());
    }
    @Test
    public void test_ifMyStackIsNotEmpty() {
        myStack.add("object");
        assertFalse(myStack.isEmpty());
    }
    @Test
    public void test_ifMyStackWillPeekElement () {
        myStack.add("object");
        assertEquals("Object",myStack.peek());
    }




}
