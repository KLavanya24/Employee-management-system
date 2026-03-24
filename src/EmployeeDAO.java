import java.util.*;

public class EmployeeDAO {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee emp) {
        employees.add(emp);
        System.out.println("Employee added!");
    }

    public void viewEmployees() {
        for (Employee e : employees) {
            System.out.println(e.getId() + " " + e.getName() + " " + e.getDepartment() + " " + e.getSalary());
        }
    }

    public void updateEmployee(int id, double salary) {
        for (Employee e : employees) {
            if (e.getId() == id) {
                e.setSalary(salary);
                System.out.println("Updated!");
                return;
            }
        }
        System.out.println("Employee not found!");
    }

    public void deleteEmployee(int id) {
        employees.removeIf(e -> e.getId() == id);
        System.out.println("Deleted!");
    }
}