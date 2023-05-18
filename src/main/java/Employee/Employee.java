package Employee;

import java.util.Objects;

public class Employee {

    private final String name;
    private final String surname;
    private final String fullName;

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.fullName = name + surname;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getFullName() {
        return this.fullName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(surname, employee.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
