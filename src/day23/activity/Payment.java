package day23.activity;
import java.util.Scanner;

public class Payment {
    public double Balance = 1000;
    
    public void pay(double amount){
        System.out.println("Paid " + amount + " using Magic!");
    }
    
    public void ChoosingAPayment(){
        
        Credit credit = new Credit();
        Gcash gcash = new Gcash();
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("===Choose Your Payment method===");
        System.out.println("    [1] Credit \n    [2] Gcash");
        System.out.println();
        System.out.print("Enter the number here: ");
        int choose = scanner.nextInt();
        switch(choose) {
            case 1: 
                credit.pay(399);
                break;
            case 2:
                gcash.pay(199);
                break;
        }
        scanner.close();
    }
}
