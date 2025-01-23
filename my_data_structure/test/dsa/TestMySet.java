package dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestMySet {
    private MySet mySet;
    @BeforeEach
    public void test_mySet() {
        mySet = new MySet();
    }
    @Test
    public void test_mySetIsEmpty() {
        assertTrue(mySet.isEmpty());
    }
    @Test
    public void test_mySetIsNotEmpty() {
        mySet.add("malik");
        assertFalse(mySet.isEmpty());
    }
    @Test
    public void test_mySetWillReturnASize() {
        mySet.add("malik");
        mySet.add("oj07");
        mySet.add("hello");
        assertEquals(3 , mySet.size());
    }
    @Test
    public void test_mySetCanBeCleared() {
        mySet.add("malik");
        mySet.add("oj07");
        mySet.add("hello");
        mySet.clear();
        assertTrue(mySet.isEmpty());

    }
    @Test
    public void test_mySetWouldNotContainDuplicatesElements() {
        mySet.add("malik");
        mySet.add("oj07");
        mySet.add("hello");
        mySet.add("hello");
        mySet.add("hello");
        mySet.add("happy");
        assertEquals(4 , mySet.size());

    }

}
