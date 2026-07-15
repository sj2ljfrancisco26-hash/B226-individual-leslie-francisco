package day24.discussion.Interface;

class Motorcycle implements Vehicle{       
    
    public String Brand;
    
    public void motorInfo(){
        Brand = "Honda CBR700";
        System.out.println("Brand: " + Brand);       
    }
    
    @Override
    public void startEngine(){
        System.out.println("Motorcycle engine Starts! Vroom Vroomm");
    }
    
    @Override
    public void turnOnHeadLight(){
        System.out.println("The Motorcycle Headlights are now turned on.");
    }
    
    static void stopLight(){
        System.out.println("Motorcycle Stop Light is working.");
    }
}
