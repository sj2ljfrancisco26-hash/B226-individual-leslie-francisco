package day8.discussion.Nested.Statement;
import java.util.Scanner;
public class day8_sample3 {
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your age: ");
    int age = scanner.nextInt();
    
    if(age >= 0 && age <= 12){
        System.out.println("You are a child");
        if(age <= 5){
            System.out.println("Specifically, you are Toddler");
        } else {
            System.out.println("Specifically, your are Pre-Teen");
        }
    } else if(age >= 13 && age <= 19){
        System.out.println("You are a Teenager");
        if(age <= 15){
            System.out.println("Specifically, Eary Teen");
        } else {
            System.out.println("Specifically, Late Teen");
        }
    } else if(age >= 20 && age <= 59){
        System.out.println("You are a Adult");
        if(age <= 35){
            System.out.println("Specifically, Young Adult");
        }else {
            System.out.println("Specifically, Middle-Aged");
        }
    } else if(age >= 60 && age <= 120){
        System.out.println("You are a Senior Citizen");
        if(age <= 75){
            System.out.println("Specifically, Young Senior");
        } else {
            System.out.println("Specifically, Elderly");
        }
    } else {
        System.out.println("Your age is Invalid");
    }
    }
}
