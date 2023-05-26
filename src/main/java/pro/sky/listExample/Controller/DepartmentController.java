package pro.sky.listExample.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.listExample.Employee.Employee;
import pro.sky.listExample.Service.DepartmentService;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
    private final DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }
    @GetMapping("/max-salary")
    public Optional<Employee> maxDeptSal (@RequestParam ("departmentID") Integer department) {
        return departmentService.maxDeptSal(department);
    }
    @GetMapping("/min-salary")
    public Optional<Employee> minDeptSal (@RequestParam ("departmentID") Integer department) {
        return departmentService.minDeptSal(department);
    }
    @GetMapping(value = "/all",params = {"departmentId"})
    public List<Employee> printEmployeeToDepartment (@RequestParam ("departmentID") Integer department) {
        return departmentService.printEmployeeToDepartment(department);
    }
    @GetMapping("/all")
    public Map<Integer, List<Employee>> printAllEmployee() {
        return departmentService.printAllEmployee();
    }
}
