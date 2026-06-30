package day11.discussion.Array;
import java.util.Arrays;
import java.util.Scanner;
public class day11_sample {
    public static void main(String[] args) {
       
       //Array_Samples As = new Array_Samples();
       //System.out.println("Name: " + As.names[1]);
       //System.out.println("Age: " + As.ages[1]);
       //System.out.println(Arrays.toString(As.names));
       //System.out.println(Arrays.toString(As.ages));
       //As.Array();
       List list = new List();
       list.EnteredList();
    }
}
class Array_Samples{
    public String [] names = {"Michael","Les","Kent","Ray","Patrick"};
    public int [] ages = {24,43,35,18,28};
    public void Array(){
        //for (int i = 0; i < names.length; i++){
        //    System.out.println(names[i]);
        //}
        for (String name : names){
            System.out.println(name);
        }
        //System.out.println("Lenght of names: " + names.length);    
        //System.out.println("Lenght of ages: " + ages.length);
    }
}
class List{
    public void EnteredList(){
    Scanner scanner = new Scanner(System.in);
    String[] items = new String[5];
    for (int i = 0; i < items.length; i++){
        System.out.print("Enter an Item: ");
        items[i] = scanner.nextLine();
        }
    
    System.out.println("\nItems you entered: ");
    
    for (String ItemList : items){
        System.out.println(ItemList);
        }
    }
}
    
