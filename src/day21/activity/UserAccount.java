
package day21.activity;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserAccount {
    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private String email;
    private String password;

    public UserAccount() {}

    public UserAccount(String firstName, String middleName, String lastName,
                       String address, String email, String password) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.address = address;
        this.email = validateEmail(email);
        this.password = validatePassword(password);
    }

    public String getFirstName() { return firstName; }
    public String getMiddleName() { return middleName; }
    public String getLastName() { return lastName; }
    public String getAddress() { return address; }
    public String getEmail() { return email; }
    public String getPassword() { return password; }

    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setMiddleName(String middleName) { this.middleName = middleName; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setAddress(String address) { this.address = address; }

    public void setEmail(String email) {
        this.email = validateEmail(email);
    }

    public void setPassword(String password) {
        this.password = validatePassword(password);
    }

    private String validateEmail(String email) {
        if (email == null || email.trim().isEmpty()) {
            throw new IllegalArgumentException("Email cannot be empty");
        }
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        if (!Pattern.matches(emailRegex, email)) {
            throw new IllegalArgumentException("Invalid email format");
        }
        return email;
    }

    private String validatePassword(String password) {
        if (password == null || password.length() < 8) {
            throw new IllegalArgumentException("Password must be at least 8 characters long");
        }
        if (!password.matches(".*[A-Z].*")) {
            throw new IllegalArgumentException("Password must contain at least one uppercase letter");
        }
        if (!password.matches(".*[a-z].*")) {
            throw new IllegalArgumentException("Password must contain at least one lowercase letter");
        }
        if (!password.matches(".*\\d.*")) {
            throw new IllegalArgumentException("Password must contain at least one digit");
        }
        return password;
    }

    public String getFullName() {
        StringBuilder sb = new StringBuilder();
        if (firstName != null) sb.append(firstName);
        if (middleName != null && !middleName.trim().isEmpty()) {
            sb.append(" ").append(middleName);
        }
        if (lastName != null) sb.append(" ").append(lastName);
        return sb.toString().trim();
    }
    
  
    public void UserEntry(){
            Scanner scanner = new Scanner(System.in);
        System.out.println("===Create a User Account===");

        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter middle name: ");
        String middleName = scanner.nextLine();

        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter address: ");
        String address = scanner.nextLine();

        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        
        System.out.println("[ Minimum 8 chars, uppercase, lowercase, digit ]");
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        try {
            UserAccount user = new UserAccount(firstName, middleName, lastName, address, email, password);

            System.out.println("\n=== User Account Created Successfully! ===");
            System.out.println("Full Name : " + user.getFullName());
            System.out.println("Email     : " + user.getEmail());
            System.out.println("Address   : " + user.getAddress());
            
        } catch (IllegalArgumentException e) {
            System.out.println("Error creating account: " + e.getMessage());
        }

        scanner.close();             
    }
}
