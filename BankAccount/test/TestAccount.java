import bankaccount.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestAccount {
    private Account account;
    @BeforeEach
    public void test_Account() {
        account = new Account("malik","ojo","1234" , 1 );
    }
    @Test
    public void test_startWith() {
        assertEquals("malik",account.getFirstname());
        assertEquals("ojo",account.getLastname());
    }
    @Test
    public void test_AccountBalanceIsEmpty() {
        assertTrue(account.isEmpty());
    }
    @Test
    public void test_AccountBalanceIsNotEmpty() {
        account.deposit(1000);
        assertTrue(account.isNotEmpty());
    }
    @Test
    public void test_AccountCanCheckBalance() {
        account.deposit(1000);
        assertEquals(1000,account.checkBalance("1234"));
    }
    @Test
    public void test_AccountCanDepositAndWithdraw() {
        account.deposit(1000);
        account.withdraw(1000,"1234");
        assertEquals(0,account.checkBalance("1234"));
    }
    @Test
    public void test_AccountUserCanUpdatePin() {
        account.updatePin("1234","2222");
        account.deposit(1000);
        assertEquals(1000,account.checkBalance("2222"));
    }
    @Test
    public void test_AccountCantDepositNegativeNumber() {
        account.deposit(1000);
        account.deposit(-1000);
        assertEquals(1000,account.checkBalance("1234"));
    }
    @Test
    public void test_AccountCantWithdrawWithWrongPinNumberWillThrowAnException() {
        account.deposit(1000);
        account.deposit(-1000);
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(1000,"1235"));
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(11000,"1234"));

    }



}
