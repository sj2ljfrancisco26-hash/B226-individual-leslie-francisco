package day24.activity;

abstract class Account {
    
    public String accountNumber;
    public String accountHolder;
    public double balance;

    public Account(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
       
    abstract void displayAccountInfo();
    
}
