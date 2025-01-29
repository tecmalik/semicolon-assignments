package bankaccount;

public class BankAtm {
    static String print = """
                1. Deposit
                2. Withdraw
                3. Check Balance
                4. Transfer
                5. update pin
                6. Exit
                """;
    public static void main(String[] args) {

        

    }
    public static void mainMenu(){
        print(print);
        }

    public static void print(String print) {
        System.out.println(print);
    }
}
