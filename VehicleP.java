
class Vehicle {
    public void startEngine(){
        System.out.println("vromvrom");
    }
    public void stopEngine(){
        System.out.println("petrol needed");
    }
}
class Car extends Vehicle{
    public void drive(){
        System.out.println("I am a car driver.");
    }

}
class Bike extends Vehicle{
    public void ride(){
        System.out.println("I am a bike rider");
    }

}



public class VehicleP {
    public static void main(String[] args) {
        Car car1=new Car();
        Bike bike1 = new Bike();
        car1.startEngine();
        car1.drive();
        bike1.stopEngine();
        bike1.ride();
    }
    
}
