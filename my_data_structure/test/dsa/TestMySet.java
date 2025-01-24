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
    @Test
    public void test_Add_XYZ_CheckThatMySetWouldContainY() {
        mySet.add("malik");
        mySet.add("oj07");
        mySet.add("hello");
        assertTrue(mySet.contains("hello"));
    }
    @Test
    public void test_Add_XYZ_CheckThatMySetWouldNotContainf() {
        mySet.add("malik");
        mySet.add("oj07");
        mySet.add("hello");
        assertFalse(mySet.contains("hello4"));
    }
    @Test
    public void test_Add_XYZ_And_RemoveAll() {
        mySet.add("malik");
        mySet.add("oj07");
        mySet.add("hello");
        mySet.add("hello");
        mySet.removeAll();
        assertEquals(0, mySet.size());
    }
    @Test
    public void test_Add_XYZ_And_GetindexOfElement() {
        mySet.add("malik");
        mySet.add("oj07");
        mySet.add("hello");
        mySet.add("hello");
        mySet.add("timi");
        assertEquals(3, mySet.get("timi"));
    }

}
