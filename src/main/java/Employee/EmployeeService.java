package Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
    private List<Employee> employee = new ArrayList<>();
    private final int DEFAULT_CAPACITY = 10;

    public void addEmployee(String name, String surname) {
        if (employee == null & employee.size() <= DEFAULT_CAPACITY) {
            employee.add();
            System.out.println("Employee has been added");
        }

    }

    public void removeEmployee(String name, String surname) {
        if (name.equals(name) & surname.equals(surname)) {
            employee.remove();
            System.out.println("Employee has been removed");
        }
    }

    public void findEmployee(String name, String surname) {
        if (name.equals(name) & surname.equals(surname))
            System.out.println(employee);
        System.out.println("Employee has been found");
    }

}
