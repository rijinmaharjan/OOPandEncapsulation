interface Employee {
    void work();
    double getSalary();
}

class Chef implements Employee {
    @Override
    public void work() {
        System.out.println("Chef is cooking delicious food.");
    }

    @Override
    public double getSalary() {
        return 50000.0;
    }
}

class Waiter implements Employee {
    @Override
    public void work() {
        System.out.println("Waiter is serving customers.");
    }

    @Override
    public double getSalary() {
        return 30000.0;
    }
}

public class Restaurant {
    public static void main(String[] args) {
        Employee chef = new Chef();
        Employee waiter = new Waiter();

        System.out.println("=== Chef ===");
        chef.work();
        System.out.println("Salary: $" + chef.getSalary());

        System.out.println("\n=== Waiter ===");
        waiter.work();
        System.out.println("Salary: $" + waiter.getSalary());
    }
}