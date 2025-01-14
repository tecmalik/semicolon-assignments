import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;

public class ComortInnTest {

    @Test
    public void testIfComfortInnExist () {
        ComfortInnApp comfortInnApp = new ComfortInnApp();
    }
    @Test
    public void testIfgenerateCustomerIDWillBeGenerated () {
        Admin admin = new Admin("id","name","email","password");
        String Id1Test = admin.getAdminID();
        Admin admin2 = new Admin("id2","name2","email2","password2");
        String Id2Test = admin2.getAdminID();
        assert Id1Test.equals("#Admin_1");
        assert Id2Test.equals("#Admin_2");

    }
    public void test(){

    }
}
