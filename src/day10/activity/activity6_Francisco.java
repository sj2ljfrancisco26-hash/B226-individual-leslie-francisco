package day10.activity;
import java.util.Scanner;

public class activity6_Francisco {
    public static void main(String[] args) {
        Part1 p1 = new Part1();
        p1.MultiplicationTable();
        Part2 p2 = new Part2();
        p2.MultiplicationTables();
    }
}
class Part1{

    public void MultiplicationTable(){
        System.out.println("---Multiplication Table---");
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number a number: ");
        int number = scanner.nextInt();
        
        System.out.println("\nMultiplication Table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
        scanner.close();
        System.out.println("---------------------------");
    }
}
class Part2{
    
public void MultiplicationTables() {
        System.out.println("---Multiplication Table---");
        System.out.println();
        
        // Outer loop: controls which multiplication table to display
        for (int table = 1; table <= 10; table++) {
            System.out.println("Multiplication Table of " + table + ":");
            
            // Inner loop: displays 1 to 10 multiples for the current table
            for (int i = 1; i <= 10; i++) {
                System.out.println(table + " x " + i + " = " + (table * i));
            }
            
            System.out.println("------------");
        }
    }
}