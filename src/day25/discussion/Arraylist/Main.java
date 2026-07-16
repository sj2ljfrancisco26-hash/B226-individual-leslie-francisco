package day25.discussion.Arraylist;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //create
        ArrayList<String> fruit = new ArrayList<>();
        //add
        fruit.add("Banana");
        fruit.add("Melon");
        fruit.add("Orange");
        fruit.add("Apple");
        fruit.add("Kiwi");
        fruit.add("Melon");
        fruit.add(0, "Strawberry");
        //update
        fruit.set(0, "Ponkan");
        //delete
        fruit.remove(0);
        fruit.remove("Melon");
        
        System.out.println(fruit);
        System.out.println("Get: " + fruit.get(0));
        System.out.println("Size: " + fruit.get(fruit.size()- 1));
    }
}