package day24.discussion.Interface;

interface Vehicle {
    
    abstract void startEngine();
    
    abstract void turnOnHeadLight();
    
    static void stopLight(){
        System.out.println("Stop Light is working.");
    }
}
