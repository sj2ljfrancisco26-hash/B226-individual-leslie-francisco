package day24.discussion.Abstraction;

abstract class Vehicle {
    
    String Brand;
    
    Vehicle(){
        this.Brand = Brand;
    }
    
    abstract void startEngine();
    
    abstract void turnOnHeadLight();
    
    static void stopLight(){
        System.out.println("Stop Light is working.");
    }
}
