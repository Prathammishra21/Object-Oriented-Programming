public class Employee {
    String name;
    int age;
    String designation;
    double salary;

   public Employee(String name){
       this.name = name;
    }

    public void empAge(int empAge){
       age = empAge;
    }

    public void empDesignation(String empDesignation){
       designation =empDesignation;
    }

    public void empSalary(double empSalary){
       salary = empSalary;
    }

    public void printEmployee(){
        System.out.println("Employee name is: "+name);
        System.out.println("Employee's age is: "+age);
        System.out.println("Employee's designation is: "+designation);
        System.out.println("Employee's salary is: "+salary);
    }
}
