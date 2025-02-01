package diary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestDiaries {
    private Diaries diaries;
    @BeforeEach
    public void testSetup() {
         diaries = new Diaries();
    }
    @Test
    public void test_DiariesCanContainMyDiary() {
        diaries.add("Username","password");
        assertEquals(1 , diaries.size());

    }
    @Test
    public void test_DiariesCanAddMoreDiaryToDiaries() {
        diaries.add("Username","password");
        diaries.add("Username2","password2");
        assertEquals(2 , diaries.size());
    }
    @Test
    public void test_DiariesCanDeleteDiaryFromDiaries() {
        diaries.add("Username","password");
        diaries.add("Username2","password2");
        assertEquals(2 , diaries.size());
        diaries.delete("Username","password");
        assertEquals(1 , diaries.size());
    }
    @Test
    public void test_DiariesCanReturnAnErrorWhenTryingToDeleteInValidDiaryFromDiaries() {
        diaries.add("Username","password");
        diaries.add("Username2","password2");
        assertEquals(2 , diaries.size());
        assertThrows(IllegalArgumentException.class, () -> diaries.delete("InvalidUsername","password"));
        assertThrows(IllegalArgumentException.class, () -> diaries.delete("Username","invalidpassword"));
    }
    @Test
    public void test_iCanFindByUserAndMyPasswordMoreDiaryFromDiaries() {
        diaries.add("Username1","password1");
        diaries.add("Username2","password2");
        diaries.add("Username3","password3");

        assertEquals("Username2" , diaries.findByUsername("Username2","password2").getUserName());
    }
    @Test
    public void test_myDiariesWillThrowAnErrorToFindInvalidDetailsFromDiaries() {
        diaries.add("Username1","password1");
        diaries.add("Username2","password2");
        assertThrows (IllegalArgumentException.class,()-> diaries.findByUsername("invalidUsername","invalidPassword"));
    }
}
