package pro.sky.listExample.Service;

import pro.sky.listExample.Employee.Employee;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface DepartmentService {

    List<Employee> printEmployeeToDepartment(Integer department);

    Map<Integer, List<Employee>> printAllEmployee();

    Optional<Employee> minDeptSal(Integer department);

    Optional<Employee> maxDeptSal(Integer department);

    Optional<Employee> sumDeptSal(Integer department);
}
