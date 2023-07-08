package pro.sky.listExample.Service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.sky.listExample.Employee.Employee;
import pro.sky.listExample.Exceptions.EmployeeAlreadyAddedException;
import pro.sky.listExample.Exceptions.EmployeeNotFoundException;

import java.util.*;

public class EmployeeServiceImplTest {

    private final EmployeeService employeeService = new EmployeeServiceImpl();

    @Test
    public void shouldAddEmployee() {
        Employee employee = new Employee("Ivan", "Ivanov");
        Employee employee1 = new Employee("Peter", "Petrov");
        Employee employee2 = new Employee("Boris", "Johnson");
        employeeService.add(employee.getName(), employee.getSurname());

        Collection<Employee> expected = employeeService.findAll();

        Assertions.assertNotNull(expected);
    }

    @Test
    public void shouldThrowSameEmployeeAdd() {
        Employee employee = new Employee("Ivan", "Ivanov");
        employeeService.add(employee.getName(), employee.getSurname());

        Assertions.assertThrows(EmployeeAlreadyAddedException.class,
                () -> employeeService.add(employee.getName(), employee.getSurname()));
    }

    @Test
    public void shouldRemoveEmployee() {
        Employee employee = new Employee("Ivan", "Ivanov");
        employeeService.add(employee.getName(), employee.getSurname());

        employeeService.remove(employee.getName(), employee.getSurname());
    }

    @Test
    public void shouldThrowNotFound() {
        Employee employee = new Employee("Ivan", "Ivanov");
        employeeService.add(employee.getName(), employee.getSurname());
        employeeService.remove(employee.getName(), employee.getSurname());

        Assertions.assertThrows(EmployeeNotFoundException.class,
                () -> employeeService.find(employee.getName(), employee.getSurname()));
    }


}
