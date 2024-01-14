import java.util.HashSet;
import java.util.Set;

abstract class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Getters, calculateSalary(), toString()


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && name.equals(employee.name);
    }


    public int hashCode() {
        return 31 * name.hashCode() + id;
    }
}

class PayrollSystem {

    private Set<Employee> employees;

    public PayrollSystem() {
        employees = new HashSet<>();
    }

    public void init(Set<Employee> initialEmployees) {
        employees.addAll(initialEmployees);
    }

    public void displayEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}

public class Main {

    public static void main(String[] args) {
        PayrollSystem payroll = new PayrollSystem();

        Set<Employee> employees = new HashSet<>();
        employees.add(new FullTimeEmployee("John", 1,_/* other parameters */));
        employees.add(new PartTimeEmployee("Jane", 2, /* other parameters */));

        payroll.init(employees);

        payroll.displayEmployees();
    }
}
