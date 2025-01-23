import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestMySet {

    MySet mySet;

    @BeforeEach
    public void testMySet() {
        mySet = new MySet();
    }

    @Test
    public void test_mySetIsEmpty() {
        assertTrue(mySet.isEmpty());
    }
    @Test
    public void test_mySetIsNotEmpty() {
        mySet.add("hello");
        assertFalse(mySet.isEmpty());
    }
    @Test
    public void test_mySetCanRemoveElement() {
        mySet.add("hello");
        mySet.remove("hello");
        assertTrue(mySet.isEmpty());
    }
    @Test
    public void test_mySetWillReturnSize() {
        mySet.add("hello");
        assertEquals(1 , mySet.size());
    }
    @Test
    public void test_mySetCanAddsOnly() {
        mySet.add("hello");
        mySet.add("james");
        assertEquals(2 , mySet.size());
        mySet.add("shade");
        assertTrue(mySet.contains("shade"));
    }
    @Test
    public void test_mySetAddsOnlyElementsnotPresentInTheList() {
        mySet.add("hello");
        mySet.add("james");
        mySet.add("james");
        mySet.add("shade");
        assertEquals("shade" , mySet.get(2));
    }

}
