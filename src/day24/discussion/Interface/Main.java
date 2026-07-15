package day24.discussion.Interface;

public class Main {
    public static void main(String[] args) {
        System.out.println("==Sample Interface==");
        Car car = new Car();
        car.carInfo();
        car.startEngine();
        car.turnOnHeadLight();
        car.stopLight();
    
        System.out.println();
        Motorcycle motor = new Motorcycle();
        motor.motorInfo();
        motor.startEngine();
        motor.turnOnHeadLight();
        motor.stopLight();
    }
}
