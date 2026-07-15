package day24.activity;
import java.util.Scanner;
    
public class savingsAccount extends Account implements transaction{
    Scanner scanner = new Scanner(System.in);
    
    public savingsAccount(String accountNumber,String accountHolder, double balance){
        super(accountNumber, accountHolder, balance);
    }
    
    @Override
    public void displayAccountInfo(){
        System.out.println("\n===Savings Account===");
        System.out.println("Acount Number: " + accountNumber);
        System.out.println("Acount Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
    
    @Override
    public void deposit(double amount){
        System.out.print("Enter the amount you want deposit: ");
        amount = scanner.nextInt();
        balance += amount;
        System.out.println("Deposit from Savings Account");
        System.out.print("Current balance: " + balance);   
        System.out.println();
        displayAccountInfo();
    }
    @Override
    public void withdraw(double amount){
        System.out.print("Enter how much will you withdraw: ");
        amount = scanner.nextInt();
        
        
        if(amount > balance){
            System.out.println("insufficient balance");
            System.out.println("Exiting...");
            
        } else {
          balance -= amount;
          System.out.println("Withdraw from Savings Account");
          System.out.print("Current balance: " + balance);
          System.out.println();
          displayAccountInfo();
        }

    }
}
