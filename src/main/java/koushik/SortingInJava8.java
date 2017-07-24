package koushik;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Adwiti on 7/23/2017.
 */
public class SortingInJava8 {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(new Employee("Arun", "singh", 40000), new Employee("Sachin", "tendulkar", 50000), new Employee("Rahul", "Dravid", 60000));
        System.out.println("sorting by first name");
        employees.sort((o1, o2) -> o1.getFirstName().compareTo(o2.getFirstName()));
        System.out.println(employees);
        System.out.println("sorting by salary");
        employees.sort((o1,o2) -> o2.getSalary().compareTo(o1.getSalary()));
        System.out.println(employees);
    }
}

class Employee {
    private String firstName;
    private String lastName;
    private Integer salary;

    public Employee(String firstName, String lastName, Integer salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Employee{");
        sb.append("firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }
}
