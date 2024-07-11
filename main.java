import java.time.LocalDate;
public class Main {
    public static void main(String[] args) {
        //Step 5:Create an instance of Employee and test its functionality
        Employee employee = new Employee("Sarah", 20000, LocalDate.of(2015, 6, 1));
        //Display employee details
        System.out.println("Employee Details: ");
        System.out.println("Name: " + employee.getName());
        System.out.println("Salary: $" + employee.getSalary());
        System.out.println("Hire Date: " + employee.getHireDate());


        //Calculate and display years of service
        System.out.println("Years of service: " + employee.calculateYearsOfService());
    }
}
