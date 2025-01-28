import bankaccount.Bank;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBank {
    Bank bank;
    @BeforeEach
    public void testBank() {
        bank = new Bank();
    }
    @Test
    public void test_bankCanCreateAccount() {
        bank.createAccount("malik","1234","ojo");
        assertEquals(1,bank.getAccountNumber());
    }
    @Test
    public void test_bankCangetAccount() {
        bank.createAccount("malik","1234","ojo");
        bank.createAccount("danel","2222","oji");
        assertEquals(2,bank.getAccountNumber());
    }



}
