abstract class Bird {
    abstract void fly();
}

class Eagle extends Bird {
    @Override
    void fly() {
        System.out.println("Eagle soars high in the sky!");
    }
}

class Penguin extends Bird {
    @Override
    void fly() {
        System.out.println("Penguins cannot fly, they waddle and swim.");
    }
}

public class BirdTest {
    public static void main(String[] args) {
        Bird eagle = new Eagle();
        Bird penguin = new Penguin();

        eagle.fly();   
        penguin.fly(); 
    }
}