public class EmployeeTest {
    public static void main(String[] args) {
        Employee emptest = new Employee("Parth Mishra");
        emptest.empAge(12);
        emptest.empDesignation("CEO");
        emptest.empSalary(1200000);
        emptest.printEmployee();
    }
}
