package Employee;

public interface EmployeeService {
    Employee add(String name, String surname);

    Employee remove(String name, String surname);

    Employee find(String name, String surname);
}
