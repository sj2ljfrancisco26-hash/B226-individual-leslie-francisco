package Day15.discussion.Methods;
import java.util.Scanner;

public class day15_sample2 {
    public static void main(String[] args) {
        sample samp = new sample();
        samp.randomNumber();
    }
}
class sample{
    public void randomNumber(){
        
        int randomnumber = (int)(Math.random() * 58) + 1;
        //System.out.println(randomnumber);
        System.out.println("==|Lotto Winning Numbers|==");
        for (int i = 0; i < 6; i++) {
            int randomNumber = (int) (Math.random() * 58) + 1;           
            //System.out.println(randomNumber);
            System.out.println("[" + (i + 1) + "]: " + randomnumber);
        }    
    }
}
//Up-casting: int to double
//Down-casting : double to int