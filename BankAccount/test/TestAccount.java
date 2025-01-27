import bankaccount.Account;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestAccount {
    private Account account;
    @BeforeEach
    public void test_Account() {
        account = new Account();
    }
    @Test
    public void test_AccountBalenceIsEmpty() {
        assertTrue(account.isEmpty());
    }
    @Test
    public void test_AccountBalenceIsNotEmpty() {
        account.deposit(1000);
        assertTrue(account.isNotEmpty());
    }
    @Test
    public void test_AccountBalanceIsNotEmpty() {
        account.deposit(1000);
        assertFalse(account.isEmpty());
    }
    @Test
    public void test_AccountCanWithdraw() {
        account.deposit(1000);
        account.withdraw()
    }
}
