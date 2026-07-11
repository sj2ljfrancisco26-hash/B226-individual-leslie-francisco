
package day17.discussion.Oop;

public class Ballpen {
    String brand;
    String color;
    float pointSize;
    double weightIngrams;
    
    public void write(){
        System.out.println("Writing...");
    }
    
    public void draw(){
        System.out.println("Drawing...");
    }
    
    public void sketch(){
        System.out.println("Sketching..."); 
    }
    public void bpenInfo(){
        System.out.println("Brand: " +brand + "\n" + "Color: "+ color + "\n" + "Point Size: "+ pointSize + "\n" + "Weight: " +weightIngrams);
    }
}
