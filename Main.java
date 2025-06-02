class Vehicle {
    public void drive(){
        System.out.println("This vehicle is four wheeled");
    }
}
class Car extends Vehicle{
    public void display(){
        System.out.println("The speed this car goes to is insane");
    }

}
public class Main{
    public static void main(String[] args) {
        Car car1 = new Car();

        car1.drive();
        car1.display();
    }
}
