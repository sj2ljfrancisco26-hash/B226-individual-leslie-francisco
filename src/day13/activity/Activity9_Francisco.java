package day13.activity;
import java.util.Scanner;

public class Activity9_Francisco {
    public static void main(String[] args) {
        stringClass SC = new stringClass();
        SC.StringMethods();
        CountryAnalyzer Ca = new CountryAnalyzer();
        Ca.Country();
    }
} 
    

class stringClass{   
    public void StringMethods() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        System.out.println("\n|=== String Methods ===|\n");
        System.out.println("Original String: \"" + str + "\"");
        
        // 1. contains()
        //What it does: Checks if the string contains a specific sequence of characters (substring).
        //Returns: boolean (true or false).
        System.out.println("contains(\"Java\")       : " + str.contains("Java"));
        
        // 2. endsWith()
        //What it does: Checks whether the string ends with the specified suffix.
        //Returns: boolean.
        System.out.println("endsWith(\"!\")          : " + str.endsWith("!"));
        
        // 3. startsWith()
        //What it does: Checks whether the string begins with the specified prefix.
        //Returns: boolean.
        System.out.println("startsWith(\"Hello\")    : " + str.startsWith("Hello"));
        
        // 4. indexOf()
        //What it does: Returns the first occurrence index (position) of the specified character or substring.
        //Returns: int (position starting from 0). Returns -1 if not found.
        System.out.println("indexOf(\"a\")           : " + str.indexOf("a"));
        
        // 5. isEmpty()
        //What it does: Checks if the string has zero characters (length == 0).
        //Returns: boolean.
        System.out.println("isEmpty()              : " + str.isEmpty());
        
        // 6. trim()
        //What it does: Removes whitespace (spaces, tabs, newlines) from both ends of the string.
        //Returns: A new string with leading and trailing whitespace removed.
        String trimmed = str.trim();
        System.out.println("trim()                 : \"" + trimmed + "\"");
        
        // 7. replace()
        //What it does: Replaces all occurrences of one character/string with another.
        //Returns: A new string with replacements.
        String replaced = str.replace("a", "@");
        System.out.println("replace('a','@')       : \"" + replaced + "\"");
        
        // 8. toCharArray()
        //What it does: Converts the entire string into an array of individual characters.
        //Returns: char[] (character array).
        char[] charArray = str.toCharArray();
        System.out.print("toCharArray()          : ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();
        
        // 9. nextLine().charAt()
        //nextLine(): Reads a full line of input from the user (from Scanner).
        //charAt(index): Returns the character at the specified position (index starts at 0).
        System.out.print("\nEnter a string to test charAt(): ");
        String another = scanner.nextLine();
        if (!another.isEmpty()) {
            System.out.println("charAt(2)              : '" + another.charAt(2) + "'");
        }
        
        // 10. valueOf()
        //What it does: Converts different data types (int, double, boolean, char, etc.) into a String.
        //Returns: A string representation of the value.
        double number = 956365.54;
        String numStr = String.valueOf(number);
        System.out.println("String.valueOf(12345)  : \"" + numStr + "\"");
        
        scanner.close();
        
        System.out.println("");
        System.out.println("");
        System.out.println("+---------------------+----------------+--------------------------------+");
        System.out.println("| Method              | Returns        | Main Purpose                   |");
        System.out.println("+---------------------+----------------+--------------------------------+");
        System.out.println("| contains()          | boolean        | Check if substring exists      |");
        System.out.println("| endsWith()          | boolean        | Check suffix                   |");
        System.out.println("| startsWith()        | boolean        | Check prefix                   |");
        System.out.println("| indexOf()           | int            | Find position of character/substring |");
        System.out.println("| isEmpty()           | boolean        | Check if string is empty       |");
        System.out.println("| trim()              | String         | Remove leading/trailing spaces |");
        System.out.println("| replace()           | String         | Replace characters/substrings  |");
        System.out.println("| toCharArray()       | char[]         | Convert string to char array   |");
        System.out.println("| charAt()            | char           | Get character at specific index|");
        System.out.println("| valueOf()           | String         | Convert other types to String  |");
        System.out.println("+---------------------+----------------+--------------------------------+");
        System.out.println("");
    }
}
class CountryAnalyzer {
    public void Country() {
        System.out.println("===Stretch Goal===");
        String country = "Philippines";
        
        // Task 1: Display first and last character
        if (country.length() > 0) {
            char firstChar = country.charAt(0);
            char lastChar = country.charAt(country.length() -
                    1);
            System.out.println("First character: " + firstChar);
            System.out.println("Last character: " + lastChar);
        } else {
            System.out.println("String is empty.");
        }
        
        // Task 2: Count P/p appearances (case-insensitive for P/p)
        int pCount = 0;
        for (char c : country.toCharArray()) {
            if (c == 'P' || c == 'p') {
                pCount++;
            }
        }
        System.out.println("Number of 'P' or 'p' characters: " + pCount);
        
        // Task 3: Count vowels (a, e, i, o, u) - case-insensitive
        int vowelCount = 0;
        String vowels = "aeiouAEIOU";
        for (char c : country.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                vowelCount++;
            }
        }
        System.out.println("Total number of vowels: " + vowelCount);
    }
}