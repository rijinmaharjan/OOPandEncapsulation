public class Employee {
    private String name;
    private String jobTitle;
    private double salary;

    public void setName(String name){
        this.name = name;
    }  
    public String getName(){
        return name;
    }
    public void setJobTitle(String jobTitle){
        this.jobTitle = jobTitle;
    }  
    public String getJobTitle(){
        return jobTitle;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }  
    public double getSalary(){
        return salary;
    }
    public double calculateRaise(double percentage){
        return salary + (salary * percentage / 100);
    }
    public void updateSalary(double newSalary){
        this.salary = newSalary;
    }
}

class EmployeeDriver {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Sukrant Kharel");
        System.out.println(employee.getName());
        employee.setJobTitle("Bathroom Cleaner");
        System.out.println(employee.getJobTitle());
        employee.setSalary(200.20);
        System.out.println(employee.getSalary());
        double raisedSalary = employee.calculateRaise(10);
        System.out.println("Salary after 10% raise: " + raisedSalary);
        employee.updateSalary(250.50);
        System.out.println("Updated Salary: " + employee.getSalary());
    }
}
