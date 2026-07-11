package day13.discussion.StringClass;
import java.util.Scanner;
public class day12_sample {
    public static void main(String[] args) {
        String word = "Hellow Java";
        for (int i = word.length() - 1; i >= 0; i--) {
            System.out.println(word.charAt(i));
            
            Entry e = new Entry();
            e.Scanner();
        }       
    }
}
class Entry{
    public void Scanner(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you sure that you want to exit? \n\t[Y] Yes \n\t[N] No");
        System.out.print("Enter your choice: ");    
        String choice = scanner.nextLine();
        
        if (choice.equalsIgnoreCase("Y")) {
            System.out.println("Exiting...");
        } else {
            System.out.println("Go Back to Main Menu");
        }
    }
}
/*
    charAt()

    int num = 10; // fixed value
        
        
        String word = "Hello";
        //System.out.println(word.charAt(0));
        //System.out.println(word.charAt(2));
        
        //System.out.print("Enter gender: ");
        String gender = "Female"; // The String value
        char genderPrefix = gender.charAt(0); // Gets the first character
        System.out.println(genderPrefix);
*/


/*
    length()

    String word = "Hello Java";
        System.out.println(word.length());   
        
        
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }
*/


/* toUpperCase() toLowerCase()
    String country = "Philippines";
        
        System.out.println(country.toLowerCase());
        System.out.println(country.toUpperCase());
*/

/*
     concat() +
        String firstName = "Winter";
        String lastName = " Mapagmahal";
        
        System.out.println(firstName.concat(lastName));
        System.out.println(firstName + lastName);
*/

/*
    // equals()
        String username = "winter";
        String loginUsername = "winter123";
        
        System.out.println(username.equals(loginUsername));
*/