package Employee;

import Exceptions.EmployeeAlreadyAddedException;
import Exceptions.EmployeeNotFoundException;
import Exceptions.EmployeeStorageIsFullException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class EmployeeService {
    private List<Employee> employee = new ArrayList<>();
    private final int DEFAULT_CAPACITY = 10;

    public void addEmployee(String name, String surname) {
        if (employee == null & employee.size() <= DEFAULT_CAPACITY) {
            employee.add();
            System.out.println("Employee has been added");
        }
        throw new EmployeeStorageIsFullException("Out of storage size");
        if (name.equals(name) & surname.equals(surname)) {
            throw new EmployeeAlreadyAddedException("Employee is already added");
        }
    }

    public void removeEmployee(String name, String surname) {
        if (name.equals(name) & surname.equals(surname)) {
            employee.remove();
            System.out.println("Employee has been removed");
        }
        throw new EmployeeNotFoundException("Employee not found");
    }

    public void findEmployee(String name, String surname) {
        if (name.equals(name) & surname.equals(surname)) {
            System.out.println(employee);
            System.out.println("Employee has been found");
        }
        throw new EmployeeNotFoundException("Employee not found");

    }
}
