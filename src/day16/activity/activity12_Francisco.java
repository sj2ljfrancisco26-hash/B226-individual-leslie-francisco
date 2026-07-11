package day16.activity;
import java.util.Scanner;

public class activity12_Francisco {
    public static void main(String[] args) {
        
        printName50Times();   
        System.out.println("Square Root: " + getSquareRoot(16));
        System.out.println("Power: " + getPower(2, 5));
        System.out.print("Print Random: ");
        System.out.println(getCircleArea(5));
        checkVoter(20);
        System.out.println("WordLength: "+ getWordLength("Hello"));
        System.out.print("Reverse method: ");
        printReverse("Java Rice");
        checkOddEven(7);
        printFullNameAge("Francisco,Leslie ", 27);   
        
    } 
    
    // 1. Check odd or even
    public static void checkOddEven(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }
    }
    // 2. Print name 50 times
    public static void printName50Times() {
        for (int i = 0; i <= 50; i++) {
            System.out.println("Francisco,Leslie");
        }
    }
    // 3. Square root
    public static double getSquareRoot(double num) {
        return Math.sqrt(num);
    }
    // 4. Power of number
    public static double getPower(double base, int exp) {
        return Math.pow(base, exp);
    }
    // 5. Random number 1-100
    public static void printRandom() {
        int randian = (int)(Math.random() * 100) + 1;
        System.out.print("Random number: " + randian);
    }
    // 6. Area of circle
    public static double getCircleArea(double radius) {
        return Math.PI * radius * radius;
    }
    // 7. Check voter
    public static void checkVoter(int age) {
        if (age >= 18) {
            System.out.println("You are a voter");
        } else {
            System.out.println("You are not a voter");
        }
    }
    // 8. Length of word
    public static int getWordLength(String word) {
        return word.length();
    }
    // 9. Print word in reverse
    public static void printReverse(String word) {
        String reverse = new StringBuilder(word).reverse().toString();
        System.out.println(reverse);
    }
    // 10. Print full name and age
    public static void printFullNameAge(String name, int age) {
        System.out.println("Full Name: " + name + ", Age: " + age);
    }    
}