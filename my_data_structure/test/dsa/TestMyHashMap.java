package dsa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestMyHashMap {
    private MyHashMap myHashMap;
    @BeforeEach
    public void setUp() {
        myHashMap = new MyHashMap();
    }
    @Test
    public void test_myMapIsEmpty() {
        assertTrue(myHashMap.isEmpty());
    }
    @Test
    public void test_myMapIsNotEmpty() {
        myHashMap.put("key"," i love my wife ");
        assertFalse(myHashMap.isEmpty());
    }
    @Test
    public void test_ifKeyWillReturnIsValue() {
        myHashMap.put("key","i love my life");
        assertEquals("i love my life", myHashMap.get("key"));
    }
    @Test
    public void test_ifValueWillReturnIsValueOf_size() {
        myHashMap.put("key","i love my life");
        assertEquals( 1, myHashMap.size());

    }
    @Test
    public void test_AddKet_X_AndValue_Y_andClear() {
        myHashMap.put("key","i love my life");
        myHashMap.clear();
    }
    @Test
    public void test_AddKet_X_And_Duplicate_Y_Value() {
        myHashMap.put("key","i love my life");
        myHashMap.put("james","i love my self");
        myHashMap.put("james","i am a boy");
        assertEquals(2,myHashMap.size());
        assertEquals("i am a boy", myHashMap.get("james"));
    }
 /**   @Test
    public void test_ToAdd2_keysAndValuesAndGetTheSetsOfKeys() {
        myHashMap.put("key","i love my life");
        myHashMap.put("james","i am a boy");
        myHashMap.keySet();
        assertEquals("key", myHashMap.keySet()[0]);
        assertEquals("james",myHashMap.keySet()[1]);
    }*/


}
