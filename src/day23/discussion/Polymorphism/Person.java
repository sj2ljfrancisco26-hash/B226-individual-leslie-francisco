package day23.discussion.Polymorphism;

import java.util.Scanner;
public class Person {
    
    String name;
    String age;
    
    public void role(){
        System.out.println("Just a Person");
    }
    public void ChoosingARole(){
        Father father = new Father();
        Husband husband = new Husband();
        Child child = new Child();
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("==WHAT ARE YOU!==");
        System.out.println("   [1] Father \n   [2] Husband   \n   [3] Child");
        System.out.println();
        System.out.print("Choose a role: ");
        int choose = scanner.nextInt();
        switch(choose) {
            case 1: 
                father.role();
                break;
            case 2:
                husband.role();
                break;
            case 3:
                child.role();
                break;
        }
        scanner.close();
    }
}
