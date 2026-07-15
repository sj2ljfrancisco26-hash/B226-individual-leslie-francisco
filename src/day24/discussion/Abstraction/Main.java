package day24.discussion.Abstraction;

public class Main {
    public static void main(String[] args) {
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
