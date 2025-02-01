//import bankaccount.Bank;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class TestBank {
//    Bank bank;
//    @BeforeEach
//    public void testBank() {
//        bank = new Bank();
//    }
//    @Test
//    public void test_bankCanCreateAccount() {
//        bank.createAccount("malik","ojo","1234");
//        assertEquals(1,bank.getAccountNumber("malik","ojo"));
//    }
//    @Test
//    public void test_bankCanGetAccountNumbersIndependently() {
//        bank.createAccount("malik","ojo","1234");
//        bank.createAccount("daniel","oji","2222");
//        bank.createAccount("sarah","ojo","1234");
//        assertEquals(2,bank.getAccountNumber("daniel","oji"));
//    }
//    @Test
//    public void test_thatAccountNumbersAreBeenCreated() {
//        bank.createAccount("malik","ojo","1234");
//        bank.createAccount("daniel","oji","2222");
//        bank.getAccountNumber("malik","ojo");
//        assertEquals(1,bank.getAccountNumber("malik","ojo"));
//    }
//    @Test
//    public void test_bankCanDeposit() {
//        bank.createAccount("malik","ojo","1234");
//        bank.deposit(1,1000);
//        assertEquals(1000,bank.checkBalance(1,"1234"));
//    }
//    @Test
//    public void test_bankCanWithdraw() {
//        bank.createAccount("malik","ojo","1234");
//        bank.deposit(1,1000);
//        assertEquals(1000,bank.checkBalance(1,"1234"));
//        bank.withdraw(1,50,"1234");
//        assertEquals(950,bank.checkBalance(1,"1234"));
//    }
//    @Test
//    public void test_bankCanTransfer() {
//        bank.createAccount("malik","ojo","1234");
//        bank.createAccount("daniel","oji","2222");
//        bank.deposit(1,1000);
//        bank.bankTransfer(1,50,2,"1234");
//        assertEquals(950,bank.checkBalance(1,"1234"));
//        assertEquals(50,bank.checkBalance(2,"2222"));
//    }
//    @Test
//    public void test_bankWontDepositNegativeNumbers(){
//        bank.createAccount("malik","ojo","1234");
//        bank.deposit(1,-1000);
//        assertEquals(0,bank.checkBalance(1,"1234"));
//    }
//
//
//}
