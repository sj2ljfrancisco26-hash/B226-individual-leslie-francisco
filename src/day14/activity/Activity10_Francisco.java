package day14.activity;
import java.util.Scanner;

public class Activity10_Francisco {
    public static void main(String[] args) {
        day10Sample d10s = new day10Sample();
        d10s.mathClass();
    }
}
class day10Sample{
    public void mathClass(){      
        Scanner scanner = new Scanner(System.in);
        
        while (true) {     
            System.out.println("=== Java Math Class ===");
            System.out.print("Select a number to choose an Operation: ");
            System.out.println("\n1.  Math.abs()");
            System.out.println("2.  Math.max()");
            System.out.println("3.  Math.min()");
            System.out.println("4.  Math.pow()");
            System.out.println("5.  Math.sqrt()");
            System.out.println("6.  Math.round()");
            System.out.println("7.  Math.ceil()");
            System.out.println("8.  Math.floor()");
            System.out.println("9.  Math.random()");
            System.out.println("10. Math.log()");
            System.out.println("11. Math.log10()");
            System.out.println("12. Math.exp()");
            System.out.println("13. Math.sin()");
            System.out.println("14. Math.cos()");
            System.out.println("15. Math.tan()");
            System.out.println("0.  Exit");
            System.out.print("\nEnter your choice: ");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1: 
                    //Math.abs(x)Returns the absolute (non-negative) value of x. 
                    //Removes the sign.
                    System.out.println("You've choosen Math.abs()");
                    System.out.print("Enter a number: ");
                    double num1 = scanner.nextDouble();
                    System.out.println("Math.abs(" + num1 + ") = " + Math.abs(num1));
                    break;
                       
                case 2:
                    //Math.max(a, b)Returns the larger of the two numbers.
                    System.out.println("You've choosen Math.max()");
                    System.out.print("Enter first number: ");
                    double a = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double b = scanner.nextDouble();
                    System.out.println("Math.max(" + a + ", " + b + ") = " + Math.max(a, b));
                    break;
                       
                case 3: 
                    //Math.min(a, b)Returns the smaller of the two numbers.   
                    System.out.print("Enter first number: ");
                    a = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    b = scanner.nextDouble();
                    System.out.println("Math.min(" + a + ", " + b + ") = " + Math.min(a, b));
                    break;
                    
                case 4:
                    //Math.pow(base, exponent)Raises base to 
                    //the power of exponent (base^exponent).   
                    System.out.print("Enter base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter exponent: ");
                    double exp = scanner.nextDouble();
                    System.out.println("Math.pow(" + base + ", " + exp + ") = " + Math.pow(base, exp));
                    break;
                    
                case 5:
                    //Math.sqrt(x)Returns the square root of x.
                    System.out.print("Enter a positive number: ");
                    double sqrtNum = scanner.nextDouble();
                    if (sqrtNum >= 0) {
                        System.out.println("Math.sqrt(" + sqrtNum + ") = " + Math.sqrt(sqrtNum));
                    } else {
                        System.out.println("Cannot take square root of negative number!");
                    }
                    break;
                    
                case 6: 
                    //Math.round(x)Rounds x to the nearest integer (standard rounding rules).
                    System.out.println("You've choosen Math.round()");
                    System.out.print("Enter a decimal number: ");
                    double roundNum = scanner.nextDouble();
                    System.out.println("Math.round(" + roundNum + ") = " + Math.round(roundNum));
                    break;
                    
                case 7:
                    //Math.ceil(x)Rounds x up to the next whole number (ceiling).
                    System.out.println("You've choosen Math.ceil()");
                    System.out.print("Enter a decimal number: ");
                    double ceilNum = scanner.nextDouble();
                    System.out.println("Math.ceil(" + ceilNum + ") = " + Math.ceil(ceilNum));
                    break;
                    
                case 8:
                    //Math.floor(x)Rounds x down to the previous whole number.
                    System.out.println("You've choosen Math.floor()");
                    System.out.print("Enter a decimal number: ");
                    double floorNum = scanner.nextDouble();
                    System.out.println("Math.floor(" + floorNum + ") = " + Math.floor(floorNum));
                    break;
                    
                case 9:
                    //Math.random()Returns a random double value between 0.0 (inclusive) and 1.0 (exclusive).
                    System.out.print("How many random numbers do you want? (1-10): ");
                    int count = scanner.nextInt();
                    if (count < 1) count = 1;
                    if (count > 10) count = 10;
                    System.out.println("Random numbers (0.0 to 1.0):");
                    for (int i = 1; i <= count; i++) {
                        System.out.printf("Random %d: %.6f%n", i, Math.random());
                    }
                    break;
                    
                case 10:
                    //Math.log(x)Natural logarithm (base e ≈ 2.718) of x.
                    System.out.print("Enter a positive number: ");
                    double logNum = scanner.nextDouble();
                    if (logNum > 0) {
                        System.out.println("Math.log(" + logNum + ") ≈ " + Math.log(logNum));
                    } else {
                        System.out.println("Logarithm is only defined for positive numbers!");
                    }
                    break;
                    
                case 11: 
                    //Math.log10(x)Logarithm base 10 of x.
                    System.out.print("Enter a positive number: ");
                    double log10Num = scanner.nextDouble();
                    if (log10Num > 0) {
                        System.out.println("Math.log10(" + log10Num + ") = " + Math.log10(log10Num));
                    } else {
                        System.out.println("Logarithm is only defined for positive numbers!");
                    }
                    break;
                    
                case 12:
                    //Math.exp(x)Returns e raised to the power of x (inverse of natural log).
                    System.out.print("Enter exponent (x) for e^x: ");
                    double expNum = scanner.nextDouble();
                    System.out.println("Math.exp(" + expNum + ") ≈ " + Math.exp(expNum));
                    break;
                    
                case 13:
                    //Math.sin(x)Sine of an angle x given in radians.
                    System.out.print("Enter angle in degrees: ");
                    double degrees = scanner.nextDouble();
                    double radians = Math.toRadians(degrees);
                    System.out.println("sin(" + degrees + "°) = " + Math.sin(radians));
                    break;
                    
                case 14:
                    //Math.cos(x)Cosine of an angle x (radians).
                    System.out.print("Enter angle in degrees: ");
                    degrees = scanner.nextDouble();
                    radians = Math.toRadians(degrees);
                    System.out.println("cos(" + degrees + "°) = " + Math.cos(radians));
                    break;
                    
                case 15:
                    //Math.tan(x)Tangent of an angle x (radians).
                    System.out.print("Enter angle in degrees: ");
                    degrees = scanner.nextDouble();
                    radians = Math.toRadians(degrees);
                    System.out.println("tan(" + degrees + "°) ≈ " + Math.tan(radians));
                    break;
                    
                case 0:
                    System.out.println("Thank you for using the Math Demo! Goodbye.");
                    scanner.close();
                    return;
                    
                default:
                    System.out.println("Invalid choice! Please select 0-15.");
            }
            
            System.out.println("\nPress Enter to return to menu...");
            scanner.nextLine(); // consume newline
            scanner.nextLine(); // wait for user
        }
    }
}