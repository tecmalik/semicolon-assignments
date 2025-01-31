package diary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestDiary {
    @Test
    public void startWith() {
        Diary diary = new Diary("username","password");
    }
    @Test
    public void test_ThatMyDiaryIsLocked() {
        Diary diary = new Diary("username","password");
        assertTrue(diary.isLocked());
    }
    @Test
    public void test_myDiaryCanBeLocked() {
        Diary diary = new Diary("username","password");
        assertFalse(diary.isLocked());
        diary.lock();
        assertTrue(diary.isLocked());
    }
    @Test
    public void test_myDiaryCanBeUnlocked() {
        Diary diary = new Diary("username","password");
        assertFalse(diary.isLocked());
        diary.lock();
        assertTrue(diary.isLocked());
        diary.unlock("password");
        assertFalse(diary.isLocked());
    }
    @Test
    public void test_myWillThrowAnErrorForInValidPasswordInputDiaryThrow() {
        Diary diary = new Diary("username","password");
        assertFalse(diary.isLocked());
        diary.lock();
        assertTrue(diary.isLocked());
        assertThrows(IllegalArgumentException.class, () -> diary.unlock("wrong password"));

    }
    @Test
    public void test_myDiaryCanCreateEntry(){
        Diary diary = new Diary("username","password");
        diary.createEntry("Title","Body");
        assertEquals("title", findEntrybyId());


    }
}
