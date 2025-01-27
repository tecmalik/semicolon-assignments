import bankaccount.Bank;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestBank {
    @BeforeEach
    public void testBank() {
        Bank bank = new Bank();
    }
    @Test
    public void test_bankcanCreateAccount() {
        bank.create("malik","1234","ojo");
        AssertEquals(1.getAccountNumber());
    }


}
