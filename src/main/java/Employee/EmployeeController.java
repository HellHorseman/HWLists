package Employee;

import Exceptions.EmployeeAlreadyAddedException;
import Exceptions.EmployeeNotFoundException;
import Exceptions.EmployeeStorageIsFullException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping (path =/employee)
    @RequestMapping(path =/add)
    public void addEmployee(@RequestParam String name, @RequestParam String surname) {
    addEmployee(name, surname);
    }
    @RequestMapping(path=/remove)
    public void removeEmployee(@RequestParam String name, @RequestParam String surname) {

    }
    @RequestMapping(path=/find)
    public void findEmployee(@RequestParam String name, @RequestParam String surname) {

    }
}
