package day12.discussion.MultiDimentional.Array;
import java.util.Scanner;

public class Day12_sample {
    public static void main(String[] args) {
    /*    
        String[][] colors = { 
            {"white", "yellow", "pink"}, 
            {"black", "brown", "gray"}  
        };
        System.out.println(colors[1][2]);
*/
    Scanner scanner = new Scanner (System.in);
    int [][] numbers = new int[2][5];
    
    for(int i = 0; i < numbers.length; i++){
        for(int j = 0; j < numbers[i].length; i++){
            System.out.println("Enter a number[" + i + "][" + j + "]:");
            numbers [i][j] = scanner.nextInt();
        }
    }
    }
}
