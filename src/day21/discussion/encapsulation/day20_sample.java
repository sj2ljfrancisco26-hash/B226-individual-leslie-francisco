
package day21.discussion.encapsulation;

public class day20_sample {
    public static void main(String[] args) {
        System.out.println("==Encapsulation==");
        Ballpen ballpen = new Ballpen();
        ballpen.setBrand("Uno");
        ballpen.setColor("Pink");
        ballpen.setPrice(299);
        ballpen.setPointSize(0.3);
        
        System.out.println("Brand: "+ ballpen.getBrand());
        System.out.println("Color: "+ ballpen.getColor());
        System.out.println("Price: "+ ballpen.getPrice());
        System.out.println("Pointsize: "+ ballpen.getPointSize());
        System.out.println();
        
        System.out.println("==Constructor Sample==");
        Person person1 = new Person("Leslie", 27, "Pasig");
        System.out.println("Name: " + person1.name + "\nAge: " + person1.age + "\nOrigin: " + person1.origin);
        
        Person person2 = new Person("SpongeBob", 24, "Bikini Bottom");
        System.out.println("\nName: " + person2.name + "\nAge: " + person2.age + "\nOrigin: " + person2.origin);
    }
}
class Ballpen{
    
    String brand;
    String color;
    double price;
    double pointSize;
    
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setPointSize(double pointSize){
        this.pointSize = pointSize;
    }
    
    public String getBrand(){
        return brand;
    }
    public String getColor(){
        return color;
    }
    public double getPrice(){
        return price;
    }
    public double getPointSize(){
        return pointSize;
    }
}
class Person{
    String name;
    int age;
    String origin;
        public Person(String name, int age, String origin){
            this.name = name;
            this.age = age;
            this.origin = origin;
    }
}