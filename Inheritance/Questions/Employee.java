package Inheritance.Questions;

public class Employee {
    private int salary;
    public Employee(int salary){
        this.salary=salary;
    }

    public void work(){
        System.out.println("Working as an employee...");
    }
    public int getSalary(){
        return salary;
    }
}

class HRManager extends Employee{
    public HRManager(int salary){
        super(salary);
    }
    @Override
    public void work(){
        System.out.println("Working as manager");
    }
    public void addEmployee(){
        System.out.println("Add new employee...");
    }
}

class Main4{
    public static void main(String[] args) {
        Employee employee = new Employee(30000);
        HRManager hrManager = new HRManager(60000);
        employee.work();
        System.out.println("Employee salary: "+employee.getSalary());
        hrManager.work();
        System.out.println("Manager salary: "+hrManager.getSalary());
        hrManager.addEmployee();
    }
}
