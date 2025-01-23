package dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestMyArraylist {
    MyArrayList myArrayList ;
    @BeforeEach
    public void test_MyArrayList() {
        myArrayList = new MyArrayList();
    }
    @Test
    public void test_myArrayListIsEmpty() {
        assertTrue(myArrayList.isEmpty());
    }
    @Test
    public void test_myArrayListCanAcceptAnElement() {
        myArrayList.add("man");
        assertFalse(myArrayList.isEmpty());
    }
    @Test
    public void test_myArrayListCanRemoveAnElement() {
        myArrayList.add("man");
        myArrayList.add("malik");
        assertEquals("man",myArrayList.get(0));
        assertEquals("malik",myArrayList.get(1));
    }
    @Test
    public void test_thatMyArrayListWillReturnAnIndex() {
        myArrayList.add("man");
        myArrayList.add("malik");
        myArrayList.add("ojo");
        assertEquals(1,myArrayList.getIndexOf("malik"));
    }
    @Test
    public void test_myArrayListCanContainAnElement() {
        myArrayList.add("school");
        myArrayList.add("matin");
        assertTrue(myArrayList.contains("matin"));
    }
    @Test
    public void test_myArrayListCanRemoveElement() {
        myArrayList.add("man");
        myArrayList.add("malik");
        myArrayList.add("ojo");
        myArrayList.remove("malik");
        assertFalse(myArrayList.contains("malik"));
        assertEquals("ojo",myArrayList.get(1));

    }
    @Test
    public void test_myArrayListCanBeCleared() {
        myArrayList.add("jug");
        myArrayList.add("maliki");
        myArrayList.add("ant");
        myArrayList.clear();
        assertTrue(myArrayList.isEmpty());
    }
    @Test
    public void test_myArrayListCanAddFiveElement() {
        myArrayList.add("man");
        myArrayList.add("malik");
        myArrayList.add("ojo");
        myArrayList.add("jug");
        myArrayList.add("ant");
        assertEquals(5,myArrayList.size());
    }

}
