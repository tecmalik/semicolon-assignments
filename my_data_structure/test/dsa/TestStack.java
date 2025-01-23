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
        myStack.push("object");
        assertFalse(myStack.isEmpty());
    }
    @Test
    public void test_ifMyStackWillPeekElement () {
        myStack.push("object");
        assertEquals("object", myStack.peek());
    }
    @Test
    public void test_ifMyStackWillPopElement () {
        myStack.push("object");
        myStack.push("malik");
        assertEquals("malik", myStack.pop());
        assertEquals(1, myStack.size());

    }
    @Test
    public void test_ifMyStackWillSearchForAElement () {
        myStack.push("object");
        myStack.push("malik");
        assertEquals(1 , myStack.search("malik"));
    }





}
