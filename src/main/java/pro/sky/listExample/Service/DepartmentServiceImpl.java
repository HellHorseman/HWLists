package pro.sky.listExample.Service;

import org.springframework.stereotype.Service;
import pro.sky.listExample.Employee.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    private final EmployeeService employeeService;

    public DepartmentServiceImpl(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Override
    public List<Employee> printEmployeeToDepartment(Integer department) {
        return employeeService.findAll().stream().filter(p -> p.getDepartment() == department)
                .collect(Collectors.toUnmodifiableList());
    }

    @Override
    public Map<Integer, List<Employee>> printAllEmployee() {
        Map<Integer, List<Employee>> employee = employeeService.findAll().stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        return employee;
    }

    @Override
    public Optional<Employee> minDeptSal(Integer department) {
        return employeeService.findAll().stream().filter(p -> p.getDepartment() == department)
                .min(Comparator.comparingInt(Employee::getSalary));
    }

    @Override
    public Optional<Employee> maxDeptSal(Integer department) {
        return employeeService.findAll().stream().filter(p -> p.getDepartment() == department)
                .max(Comparator.comparingInt(Employee::getSalary));
    }
}
