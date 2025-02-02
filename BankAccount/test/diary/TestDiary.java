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
        assertFalse(diary.isLocked());
    }
    @Test
    public void test_myDiaryCanBeLocked() {
        diary.lock();
        assertTrue(diary.isLocked());
    }
    @Test
    public void test_myDiaryCanBeUnlocked() {
        assertFalse(diary.isLocked());
        diary.lock();
        diary.unlock("password");
        assertFalse(diary.isLocked());
    }
    @Test
    public void test_myWillThrowAnErrorForInValidPasswordInputDiaryThrow() {
        assertFalse(diary.isLocked());
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
    public void test_thatMyEntryCAnBeDeleted(){
        diary.createEntry("Title","Body");
        diary.createEntry("Title2","Body2");
        diary.createEntry("Title3","Body3");
        assertEquals(3,diary.numberOfEntry());
        diary.deleteEntry(2);
        assertEquals(2,diary.numberOfEntry());

    }
    @Test
    public void test_thatMyDiaryWouldThrowAnErrorToDeleteInvalidEntry(){
        diary.createEntry("Title","Body");
        assertThrows(IllegalArgumentException.class, () -> diary.deleteEntry(2));

    }
    @Test
    public void test_ThatMYEntryCanBeFoundById(){
        diary.createEntry("Title","Body");
        diary.createEntry("Title2","Body2");
        diary.createEntry("Title3","Body3");
        assertEquals(3,diary.numberOfEntry());

        assertEquals( "Title2" ,diary.findEntryById(2).getTitle());
        assertEquals( "Body2" ,diary.findEntryById(2).getBody());

    }
    @Test
    public void test_thatMyDiaryWillThrowAnErrorToFindAnInvalidId(){
        assertThrows(IllegalArgumentException.class, () -> diary.findEntryById(-1));

    }
    @Test
    public void test_thatMyDiaryCanUpDateEntry(){
        diary.createEntry("Title","Body");
        diary.createEntry("Title2","Body2");
        diary.updateEntry(1,"UpdatedTitle","updatedBody");
        assertEquals(2,diary.numberOfEntry());
        assertEquals( "UpdatedTitle" ,diary.findEntryById(1).getTitle());
        assertEquals( "updatedBody" ,diary.findEntryById(1).getBody());
    }
    @Test
    public void test_thatMyDiaryWouldThrowAnErrorToUpdateAnInvalidId(){
        assertThrows(IllegalArgumentException.class, () -> diary.updateEntry(1,"UpdatedTitle","updatedBody"));
        diary.createEntry("Title","Body");
        assertThrows(IllegalArgumentException.class, () -> diary.updateEntry(4,"UpdatedTitle","updatedBody"));
    }
    @Test
    public void test_thatMyDiariesWontCreateEntryIfDiaryIsLocked(){
        diary.createEntry("Title","Body");
        diary.lock();
        assertThrows(IllegalArgumentException.class,()->diary.createEntry("Title2","Body2"));
    }
}
