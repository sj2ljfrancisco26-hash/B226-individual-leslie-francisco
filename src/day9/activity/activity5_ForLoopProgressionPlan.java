package day9.activity;

import java.util.Scanner;

public class activity5_ForLoopProgressionPlan {
    public static void main(String[] args) {
        Act5_1 a51 = new Act5_1();
        a51.sum1toN();
        Act5_2 a52 = new Act5_2();
        a52.product1toN();
    }
}
class Act5_1{
        public void sum1toN(){
        System.out.println("----Sum1toN----");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = scanner.nextInt();
        
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
            System.out.println("i = " + i + ", sum = " + sum);
        }
        
        System.out.println("The Sum is: " + sum);
        System.out.println("-----------------");
    }
}
class Act5_2{
    public void product1toN(){
        System.out.println("----Product1toN----");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = scanner.nextInt();
        
        long product = 1; // Use long to handle larger factorials
        for (int i = 1; i <= n; i++) {
            product *= i;
            System.out.println("i = " + i + ", product = " + product);
        }
        
        System.out.println("The Product is: " + product);
        System.out.println("-----------------");
    }
}
class Act5_3{
    public void ArithSequence(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter start number: ");
        int start = scanner.nextInt();
        System.out.print("Enter common difference: ");
        int diff = scanner.nextInt();
        System.out.print("Enter number of terms (n): ");
        int n = scanner.nextInt();
        
        int current = start;
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        
        for (int i = 1; i <= n; i++) {
            sum += current;
            sb.append(current);
            if (i < n) sb.append(" + ");
            current += diff;
        }
        
        System.out.println(sb.toString() + " = " + sum);
        scanner.close();
    }
}