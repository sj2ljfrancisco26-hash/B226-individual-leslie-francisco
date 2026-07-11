package Day15.activity;

import java.util.Scanner;
public class day15_sample {
    public static void main(String[] args) {
        Sample sp = new Sample();
        //sp.Dicegame();
        Sample2 sp2 = new Sample2();
        sp2.GuessingGame();
    }
}
class Sample {
    public void Dicegame() {
        System.out.println("=== Simple Dice Game ===");
        System.out.println("You will roll a 6-sided die against the computer.");
        System.out.println("Highest roll wins! Let's play!\n");
        
        // Scanner for user input
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        boolean playAgain = true;
        
        while (playAgain) {
            // User's roll
            System.out.print("Press Enter to roll your die...");
            scanner.nextLine();
            
            int userRoll = rollDie();
            System.out.println("You rolled: " + userRoll);
            
            // Computer's roll
            System.out.println("Computer is rolling...");
            int computerRoll = rollDie();
            System.out.println("Computer rolled: " + computerRoll);
            
            // Determine winner
            if (userRoll > computerRoll) {
                System.out.println("🎉 You win this round!");
            } else if (computerRoll > userRoll) {
                System.out.println("💻 Computer wins this round!");
            } else {
                System.out.println("🤝 It's a tie!");
            }
            
            System.out.println("-----------------------------");
            
            // Ask to play again
            System.out.print("Play again? (y/n): ");
            String response = scanner.nextLine().trim().toLowerCase();
            playAgain = response.equals("y") || response.equals("yes");
        }
        
        System.out.println("\nThanks for playing! Goodbye 👋");
        scanner.close();
    }
    
    // Method to roll a fair 6-sided die using Math.random()
    private static int rollDie() {
        // Math.random() returns [0.0, 1.0)
        // Multiply by 6 → [0.0, 6.0)
        // Cast to int → [0, 5]
        // Add 1 → [1, 6]
        return (int)(Math.random() * 6) + 1;
    }
}
class Sample2{
    
    public void GuessingGame() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Number Guessing Game ===");
        System.out.println("I have picked a number between 1 and 100.");
        System.out.println("Can you guess it?\n");
        
        // Generate random number using Math.random()
        int secretNumber = (int)(Math.random() * 58) + 1;
        int attempts = 10;
        int guess;
        
        while (true) {
            System.out.print("Enter your guess: ");
            
            // Validate input
            while (!scanner.hasNextInt()) {
                System.out.print("Please enter a valid number: ");
                scanner.next();
            }
            
            guess = scanner.nextInt();
            attempts++;
            
            if (guess < 1 || guess > 100) {
                System.out.println("Hint: Please guess between 1 and 100.");
                continue;
            }
            
            if (guess == secretNumber) {
                System.out.println("\n🎉 Congratulations! You guessed the number in " + attempts + " attempts!");
                break;
            } else if (guess < secretNumber) {
                System.out.println("Too low! Try a higher number.");
            } else {
                System.out.println("Too high! Try a lower number.");
            }
        }
        
        System.out.println("\nThanks for playing! The secret number was " + secretNumber + ".");
        scanner.close();
    }
}