package day24.discussion.Interface;

class Car implements Vehicle{
    
    public String Brand;
    
    public void carInfo(){
        Brand = "Dodge Challenger";
        System.out.println("Brand: " + Brand);
    }
    
    @Override
    public void startEngine(){
        System.out.println("Car engine Starts! Brooom! Broom!");
    }
    
    @Override
    public void turnOnHeadLight(){
        System.out.println("The Car Headlights are now turned on.");
    }
    
    static void stopLight(){
        System.out.println("Car Stop Light is working.");
    }
}
