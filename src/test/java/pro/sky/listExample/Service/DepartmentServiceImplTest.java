package pro.sky.listExample.Service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import pro.sky.listExample.Employee.Employee;

import java.util.List;
import java.util.Optional;


public class DepartmentServiceImplTest {
    private EmployeeService employeeService;

    private DepartmentService departmentService;

    @BeforeEach
    public void setUp() {
        employeeService = Mockito.mock(EmployeeService.class);
        departmentService = new DepartmentServiceImpl(employeeService);
    }

    @Test
    public void shouldReturnMinDeptSal() {
        Employee employee = new Employee("Ivan", "Ivanov");
        Mockito.when(employeeService.findAll()).thenReturn(List.of(employee));

        Optional<Employee> result = departmentService.minDeptSal(1);

        Assertions.assertEquals("Ivan", employee.getName());
        Assertions.assertEquals("Ivanov", employee.getSurname());
    }

    @Test
    public void shouldReturnMaxDeptSal() {
        Employee employee = new Employee("Ivan", "Ivanov");
        Mockito.when(employeeService.findAll()).thenReturn(List.of(employee));

        Optional<Employee> result = departmentService.maxDeptSal(1);

        Assertions.assertEquals("Ivan", employee.getName());
        Assertions.assertEquals("Ivanov", employee.getSurname());
    }

    @Test
    public void shouldReturnSumDeptSal() {
        Employee employee = new Employee("Ivan", "Ivanov");
        Mockito.when(employeeService.findAll()).thenReturn(List.of(employee));

        Integer result = departmentService.sumDeptSal(1);

        Assertions.assertEquals("Ivan", employee.getName());
        Assertions.assertEquals("Ivanov", employee.getSurname());
    }

    @Test
    public void shouldReturnPrintAllEmployeeToDepartment() {
        Employee employee = new Employee("Ivan", "Ivanov");
        Mockito.when(employeeService.findAll()).thenReturn(List.of(employee));

        List<Employee> result = departmentService.printEmployeeToDepartment(1);

        Assertions.assertEquals("Ivan", employee.getName());
        Assertions.assertEquals("Ivanov", employee.getSurname());
    }
}
