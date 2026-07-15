package day24.activity;
import java.util.Scanner;

public class Activity_15 {
    public static void main(String[] args) {
        
        savingsAccount sa = new savingsAccount("1436", "Leslie", 499);
        checkingAccount ca = new checkingAccount("6314", "Trixia", 799);
        
        
                   Scanner scanner = new Scanner(System.in);
        System.out.println("=============[ WELCOME ]===============\n");
        System.out.println("[1]SavingsAccount\n[2]Checking Account\n[3]Exit\n");
        System.out.print("What can we do for you today?");
        int choose = scanner.nextInt();
        
        switch(choose){
            case 1:
                sa.displayAccountInfo();
                System.out.println("\n[1]Deposit [2]Withdraw [3]Exit");
                System.out.print("\nSelect Transaction: ");
                int satran = scanner.nextInt();
                
                if(satran == 1){
                    sa.deposit(0);  
                }
                if (satran == 2){
                    sa.withdraw(0);                   
                }
                if (satran == 3){
                    System.out.println("Exiting....."); 
                    System.out.println("Goodbye, Thank you");  
                }                                         
                break;
                
            case 2:
                ca.displayAccountInfo();
                System.out.println("\n[1]Deposit [2]Withdraw [3]Exit");
                System.out.print("\nSelect Transaction: ");
                int caTran = scanner.nextInt();
                
                if(caTran == 1){
                    sa.deposit(0);  
                }
                if (caTran == 2){
                    sa.withdraw(0);                   
                }
                if (caTran == 3){
                    System.out.println("Exiting....."); 
                    System.out.println("Goodbye, Thank you");  
                }
                break;
                
            case 3:
                System.out.println();
                System.out.println("Exiting....."); 
                System.out.println("Goodbye, Thank you");  
                scanner.close();                                         
        }                
    }
}
