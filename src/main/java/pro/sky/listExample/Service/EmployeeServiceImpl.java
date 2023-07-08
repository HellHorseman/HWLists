package pro.sky.listExample.Service;

import org.apache.commons.lang3.StringUtils;
import pro.sky.listExample.Employee.Employee;
import pro.sky.listExample.Exceptions.EmployeeAlreadyAddedException;
import pro.sky.listExample.Exceptions.EmployeeNotFoundException;
import org.springframework.stereotype.Service;
import pro.sky.listExample.Exceptions.WrongTypeException;

import java.util.*;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final Map<String, Employee> employees;

    public EmployeeServiceImpl() {
        this.employees = new HashMap<>();
    }

    @Override
    public Employee add(String name, String surname) {
        checkTypeName(name, surname);
        StringUtils.capitalize(name.toLowerCase());
        StringUtils.capitalize(surname.toLowerCase());
        Employee employee = new Employee(name, surname);
        if (employees.containsKey(employee.getFullName())) {
            throw new EmployeeAlreadyAddedException("Employee already added");
        }
        employees.put(employee.getFullName(), employee);
        return employee;
    }

    @Override
    public Employee remove(String name, String surname) {
        Employee employee = new Employee(name, surname);
        if (employees.containsKey(employee.getFullName())) {
           return employees.remove(employee.getFullName());
        }
        throw new EmployeeNotFoundException("Employee not found");
    }

    @Override
    public Employee find(String name, String surname) {
        Employee employee = new Employee(name, surname);
        if (employees.containsKey(employee.getFullName())) {
            return employees.get(employee.getFullName());
        }
        throw new EmployeeNotFoundException("Employee not found");
    }

    @Override
    public Collection<Employee> findAll() {
        return Collections.unmodifiableCollection(employees.values());
    }

    private void checkTypeName(String... values) {
        for (String value : values) {
            if (!StringUtils.isAlpha(value)) {
                throw new WrongTypeException("Invalid symbols or typo");
            }
        }

    }
}


