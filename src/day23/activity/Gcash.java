
package day23.activity;

public class Gcash extends Payment{
    
    @Override
     public void pay(double amount){
        double tira = Balance - amount;
        System.out.println("Paid " + tira + " using Gcash!");
    }
}
