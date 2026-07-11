package day6.activity;
import java.util.Scanner;
public class activity3_Francisco {
    /*
    public static void main(String[] args) {
        //Logical && Operator
     logicalOperatorAnd LoOpAnd = new logicalOperatorAnd();
     LoOpAnd.entryCheck();
       //Logical || Operator
     logicalOperatorOr LoOpOr = new logicalOperatorOr();
     LoOpOr.noClasses();   
       //Ternary Operator
     ternaryOperator TeOp = new ternaryOperator();
     TeOp.passOrfail();
      //Ternary Operator2
     ternaryOperator2 TeOp2 = new ternaryOperator2();
     TeOp2.whichIsLarger();
    }
    */
}
/*
class logicalOperatorAnd{
        public static String red = "\u001B[31m";
        public static String cyan = "\u001B[36m";
        
    public void entryCheck(){
    System.out.println(red + "---Activity: Logical && AND---");    
        
    Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: " );
        
        int age = scanner.nextInt();
        boolean hasValidID = true;
        boolean allowed = (age >= 18) && hasValidID;

        System.out.println("Your Age: " + age);
        System.out.println("Has Valid ID: " + hasValidID);
        System.out.println("Allowed to enter: " + allowed);
        System.out.println(cyan + "------------------------------");
    }
}
class logicalOperatorOr{
    public void noClasses(){
        System.out.println(logicalOperatorAnd.red + "---Activity: Logical || OR---");
        boolean isWeekend = false;
        boolean isHoliday = false;

        boolean noClasses = isWeekend || isHoliday;

        System.out.println("Is Weekend: " + isWeekend);
        System.out.println("Is Holiday: " + isHoliday);
        System.out.println("No classes today: " + noClasses);

        System.out.println(logicalOperatorAnd.cyan + "------------------------------");
    }      
}
class ternaryOperator{
    public void passOrfail(){
        System.out.println(logicalOperatorAnd.red + "---Activity: Ternary---");
        int score = 73;

        String result = (score >= 75) ? "Passed" : "Failed";

        System.out.println("Score: " + score);
        System.out.println("Result: " + result);
        System.out.println(logicalOperatorAnd.cyan + "------------------------------");
    }
}
class ternaryOperator2{
    public void whichIsLarger(){
        System.out.println(logicalOperatorAnd.red + "---Activity: which is Larger?---");
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input your first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Input your second number: ");
        int num2 = scanner.nextInt();
        
        int larger = (num1 > num2) ? num1 : num2;

        System.out.println("First number is: " + num1);
        System.out.println("Second number is: " + num2);
        System.out.println("Larger number is: " + larger);
        System.out.println(logicalOperatorAnd.cyan + "------------------------------");
    }
}
*/