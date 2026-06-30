package day11;

public class miniActivity {
    public static void main(String[] args) {
      Array_Samples As = new Array_Samples();
       As.Array();
    }
}
class Array_Samples{
    public static String red = "\u001B[31m";
    public static String cyan = "\u001B[36m";
    public int [] ages = {24,43,35,18,28};
    public void Array(){
        System.out.println(red + "Simple ForLoop");
        for (int i = 0; i < ages.length; i++){
            System.out.println(ages[i]);
        }
        System.out.println(cyan + "Traverse ForLoop");
        for (int age : ages){
            System.out.println(age);
        } 
    }
}
