package scratches;

public class SavingsAccount {
    int balance;

    public  SavingsAccount(int initialBalance)
    {
        balance = initialBalance;
    }
    public static void main(String[] args) {

        SavingsAccount savings = new SavingsAccount(3000);

        //now check the balance of the account
        System.out.println("Hello");
        System.out.println("The current balance of savings account is " +savings.balance);
    }
}