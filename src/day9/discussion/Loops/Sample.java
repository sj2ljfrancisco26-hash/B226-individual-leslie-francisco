
package day9.discussion.Loops;

public class Sample {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i <= 5; i++){
            sum += i;
        }
        //System.out.println(sum);
        
        ForLowp fl = new ForLowp();
        fl.product();
    }
}
class ForLowp{
    public void product(){
    int product = 1;
        for(int i = 1; i <= 5; i++){
            product *= i;
        }
        System.out.println(product);    
    }
}
