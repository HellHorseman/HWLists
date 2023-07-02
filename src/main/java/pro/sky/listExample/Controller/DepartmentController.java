package pro.sky.listExample.Controller;

import org.springframework.web.bind.annotation.*;
import pro.sky.listExample.Employee.Employee;
import pro.sky.listExample.Service.DepartmentService;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @GetMapping("{id}/salary/sum")
    public Optional<Employee> sumDeptSal (@PathVariable Integer department) {
        return departmentService.sumDeptSal(department);
    }

    @GetMapping("{id}/salary/max")
    public Optional<Employee> maxDeptSal (@PathVariable Integer department) {
        return departmentService.maxDeptSal(department);
    }

    @GetMapping("{id}/salary/min")
    public Optional<Employee> minDeptSal (@PathVariable Integer department) {
        return departmentService.minDeptSal(department);
    }

    @GetMapping(value = "/{id}/employees")
    public List<Employee> printEmployeeToDepartment (@PathVariable Integer department) {
        return departmentService.printEmployeeToDepartment(department);
    }
    @GetMapping("/employees")
    public Map<Integer, List<Employee>> printAllEmployee() {
        return departmentService.printAllEmployee();
    }
}
