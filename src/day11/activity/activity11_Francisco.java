package day11.activity;
import java.util.Scanner;
import java.util.Arrays;

public class activity11_Francisco {
    public static void main(String[] args) {
      Integer inT = new Integer();
        inT.EnteredNumbers();
    }
}

class Integer{
    public void EnteredNumbers(){
        String cyan = "\u001B[36m";
        String red = "\u001B[31m";
        String green = "\u001B[32m";
        String yellow = "\u001B[33m";
        String purple = "\033[35m";
        String blue = "\u001B[34m";
        
    Scanner scanner = new Scanner(System.in);
    int[] numbers = new int[5];
    System.out.println(red + "Please enter a 5 whole numbers!");
    System.out.println("-------------------------------");
    
    for (int i = 0; i < numbers.length; i++){
        System.out.print(green + "Enter a whole number: ");
        numbers[i] = scanner.nextInt();
        }
    
    System.out.println();
    System.out.println(blue + "Numbers you entered: ");
    for (int NumberList : numbers){
        System.out.println(purple + NumberList);
        }
    System.out.println();
    
    int sum = 0;
    for (int NumberList : numbers){
        sum += NumberList;
    }
    
    double average = (double) sum / 5;
        System.out.println("Sum of List Numbers: " + sum);
        System.out.println("Average of List Numbers: " + average);
        System.out.println("--------------------------");
        
        scanner.close(); 
        
        int highest = Arrays.stream(numbers).max().getAsInt();
        int lowest = Arrays.stream(numbers).min().getAsInt();

        System.out.println("Highest: " + highest);
        System.out.println("Lowest: " + lowest);   
    }
}