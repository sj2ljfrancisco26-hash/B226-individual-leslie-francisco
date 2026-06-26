package day8.discussion.Nested.Statement;
import java.util.Scanner;

public class day8_sample4 {
    //Switch Statements
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.mainMenu();
    }
}  
class Menu{
    public void mainMenu(){
        Scanner scanner = new Scanner(System.in);
        String red = "\u001B[31m";
        String cyan = "\u001B[36m";
        String green = "\u001B[32m";
        System.out.println(red + "----Main Menu----");
        System.out.println(green + "1: Start Game");
        System.out.println(green + "2: Load Game");
        System.out.println(green + "3: Settings");
        System.out.println(green + "4: Exit");
        System.out.println(red + "-----------------");
        System.out.print(cyan + "Enter a number (1-4): ");
        int choice = scanner.nextInt();
        
        switch (choice){
            case 1:
                System.out.println("You selected Option 1: Start Game");
                break;
            case 2:
                System.out.println("You selected Option 2: Load Game"); 
                break;
            case 3:
                System.out.println("You selected Option 3: Settings"); 
                break;
            case 4:
                System.out.println("You selected Option 4: Exit");
                break;
            default:
                System.out.println(green + "Invalid choice. Please try again.");
                break;
        }          
        System.out.print(red + "-----------------");
        scanner.close();   
    }
}
