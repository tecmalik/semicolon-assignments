package diary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestDiary {
    private Diary diary;

    @BeforeEach
    public void startWith() {
        diary = new Diary("username","password");
    }
    @Test
    public void test_ThatMyDiaryIsLocked() {
        assertTrue(diary.isLocked());
    }
    @Test
    public void test_myDiaryCanBeLocked() {
        assertTrue(diary.isLocked());
    }
    @Test
    public void test_myDiaryCanBeUnlocked() {
        assertTrue(diary.isLocked());
        diary.lock();
        diary.unlock("password");
        assertFalse(diary.isLocked());
    }
    @Test
    public void test_myWillThrowAnErrorForInValidPasswordInputDiaryThrow() {
        assertTrue(diary.isLocked());
        diary.lock();
        assertThrows(IllegalArgumentException.class, () -> diary.unlock("wrong password"));

    }
    @Test
    public void test_myDiaryCanContainAnEntry(){
        diary.createEntry("Title","Body");
        assertEquals(1,diary.numberOfEntry());
    }
    @Test
    public void test_thatMyDiaryWouldThrowAnErrorForNullInput(){
        assertThrows(NullPointerException.class, () -> diary.createEntry(null," "));
        assertThrows(NullPointerException.class, () -> diary.createEntry(" ", null));
    }
    @Test
    public void test_ThatMYEntryCanBeFoundById(){
        diary.createEntry("Title","Body");
        diary.createEntry("Title2","Body2");
        diary.createEntry("Title3","Body3");
        assertEquals(3,diary.numberOfEntry());
        diary.findEntryById(2);
        assertEquals(,diary.numberOfEntry());


    }


}
