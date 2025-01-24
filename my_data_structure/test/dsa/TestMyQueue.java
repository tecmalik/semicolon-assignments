package dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestTemplate;

import static org.junit.jupiter.api.Assertions.*;

public class TestMyQueue {
    private MyQueue myQueue ;
    @BeforeEach
    public void test_myQueue() {
         myQueue = new MyQueue();
    }
    @Test
    public void test_myQueue_empty() {

        assertTrue(myQueue.isEmpty());
    }
    @Test
    public void test_myQueueisNotEmpty() {
        myQueue.add("malik");
        assertFalse(myQueue.isEmpty());
    }
    @Test
    public void test_myQueueHasAsize() {
        myQueue.add("malik");
        assertEquals(1, myQueue.size());
    }
    @Test
    public void test_myQueueAddsXYZ_andReturnsASize(){
        myQueue.add("malik");
        myQueue.offer("david");
        myQueue.offer("malik");
        assertEquals(3, myQueue.size());
    }
    @Test
    public void test_myQueueAddsW_OffersXy() {
        myQueue.add("malik");
        myQueue.offer("david");
        myQueue.offer("malik");
        assertEquals("david", myQueue.get(1));
    }
    @Test
    public void test_myQueueI_RemoveElement() {
        myQueue.add("malik");
        myQueue.offer("david");
        myQueue.offer("Apple");
        myQueue.offer("banna");
        myQueue.remove();
        assertEquals(3, myQueue.size());
        myQueue.remove();
        assertEquals(2, myQueue.size());
    }
    @Test
    public void test_canPeekWithoutremovingItTheElement() {
        myQueue.add("malik");
        myQueue.offer("david");
        myQueue.offer("Apple");
        myQueue.peek();
        assertEquals(3, myQueue.size());
        myQueue.remove();

    }
    @Test
    public void test_canReturnWithoutremovingItTheElement() {
        myQueue.add("malik");
        myQueue.offer("david");
        myQueue.offer("Apple");
        myQueue.pull();
        assertEquals(3, myQueue.size());
        myQueue.remove();

    }
}
