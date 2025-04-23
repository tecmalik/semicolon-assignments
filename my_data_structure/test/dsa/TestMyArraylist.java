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
    public void test_myArrayCanAddMoreThanOneElement() {
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
    @Test
    public void test_myArrayListWillReturnFalseIfElementDoesNotContainAnElement() {
        myArrayList.add("man");
        myArrayList.add("malik");
        myArrayList.add("ojo");
        assertFalse(myArrayList.contains("jug"));
        assertTrue(!myArrayList.contains("jug"));
    }
    @Test
    public void test_myArryListAdds_ADC_Replace_D_With_B(){
        myArrayList.add("man");
        myArrayList.add("malik");
        myArrayList.add("woman");
        myArrayList.setElement(1,"male");
        assertEquals("male",myArrayList.get(1));
    }
    @Test
    public void test_myArrayListCanAdd4ElementandRemoveSecondElement() {
        myArrayList.add("man");
        myArrayList.add("malik");
        myArrayList.add("ojo");
        myArrayList.add("jug");
        myArrayList.remove("malik");
        assertFalse(myArrayList.contains("malik"));
        assertEquals("ojo", myArrayList.get(1));
        assertEquals("jug", myArrayList.get(2));
    }


    }
