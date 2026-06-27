package startagain.basic;


public class variable {
    String accountHolder;
    double balance;

    public void BankAccount(String name , double initialBalance){
        accountHolder = name;
        balance = initialBalance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount;
    }
}
