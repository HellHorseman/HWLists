package Employee;

import Exceptions.EmployeeAlreadyAddedException;
import Exceptions.EmployeeNotFoundException;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final Map<String, Employee> employeeList;

    public EmployeeServiceImpl() {
        this.employeeList = new HashMap<String, Employee>();
    }

    @Override
    public Employee add(String name, String surname) {
        Employee employee = new Employee(name, surname);
        if (employeeList.containsKey(employee.getFullName())) {
            throw new EmployeeAlreadyAddedException("Employee already added");
        }
        employeeList.put(employee.getFullName(), employee);
        return employee;
    }

    @Override
    public Employee remove(String name, String surname) {
        Employee employee = new Employee(name, surname);
        if (employeeList.containsKey(employee.getFullName())) {
            employeeList.remove(employee);
            return employee;
        }
        throw new EmployeeNotFoundException("Employee not found");
    }

    @Override
    public Employee find(String name, String surname) {
        Employee employee = new Employee(name, surname);
        if (employeeList.containsKey(employee.getFullName())) {
            return employee;
        }
        throw new EmployeeNotFoundException("Employee not found");
    }

//    @Override
//    public Collection<Employee> findAll() {
//        return Collections.unmodifiableMap(employeeList.entrySet());
//    }
}
