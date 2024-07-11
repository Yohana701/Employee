import java.time.LocalDate;
import java.time.Period;


public class Employee {
    //Step 1: Define attributes for name, salary, hire date
    private String name;
    private double salary;
    private LocalDate hireDate;


    //Step 2: Adding the constructor
    public Employee(String name, double salary, LocalDate hireDate){
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }
    //Step 3: Getter Method for the attributes
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public LocalDate getHireDate(){
        return hireDate;
    }
    //Step 4:Add a method to calculate years of service
    public int calculateYearsOfService(){
        LocalDate currentDate = LocalDate.now();
        return Period.between(hireDate, currentDate).getYears();
    }
}
