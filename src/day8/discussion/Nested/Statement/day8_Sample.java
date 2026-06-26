
package day8.discussion.Nested.Statement;
import java.util.Scanner;
public class day8_Sample {
    public static void main(String[] args) {
        //ConditionalStatement
        //user login
        LoginAuthentication LA = new LoginAuthentication();
        LA.Login();
       
    }
}
class LoginAuthentication {
    public void Login() {
        System.out.println("=== Login Authentication System ===\n");
        Scanner scanner = new Scanner(System.in);
        
        String correctUsername = "admin";
        String correctPassword = "password123";
        int maxAttempts = 3;
        int attempts = 2;
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        

        if (attempts >= maxAttempts) {
            System.out.println("Account locked due to too many failed attempts!");
            System.out.println("Please contact support or try again later.");
        } 
        else {
            if (username.equals(correctUsername)) {
                if (password.equals(correctPassword)) {
                    System.out.println("Login Successful! ✅");
                    System.out.println("Welcome back, " + username + "!");
                    if (username.equals("admin")) {
                        System.out.println("Admin privileges granted.");
                    } else {
                        System.out.println("Standard user access granted.");
                    }
                } else {
                    System.out.println("Login Failed! ❌");
                    System.out.println("Incorrect password.");
                    System.out.println("Attempts remaining: " + (maxAttempts - attempts - 1));
                }
            }else {
                System.out.println("Login Failed! ❌");
                System.out.println("Username not found.");
                System.out.println("Attempts remaining: " + (maxAttempts - attempts - 1));
            }
        }
    }
}