// Employee class
class Employee {
    int employeeId;
    String name, position;
    double salary;

    // constructor to create the new employees
    Employee(int id, String name, String pos, double sal) {
        employeeId = id;
        this.name = name;
        position = pos;
        salary = sal;
    }
}

// class for manage employees
public class EmployeeManagementSystem {
    Employee[] arr = new Employee[100]; // array for store employee
    int size = 0; // current number of employee
    // this method add a employee

    void add(Employee e) {
        arr[size++] = e;
    }

    // this method search for employee by there id
    int search(int empId) {
        for (int i = 0; i < size; i++)
            if (arr[i].employeeId == empId)
                return i;
        return -1;
    }

    // this method print all employee names
    void traverse() {
        for (int i = 0; i < size; i++)
            System.out.println(arr[i].name);
    }

    // this method delete a employee
    void delete(int empId) {
        int idx = search(empId);
        if (idx != -1) {
            for (int i = idx; i < size - 1; i++)
                arr[i] = arr[i + 1];
            size--;
        }
    }

    // main method for test the system
    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem();
        ems.add(new Employee(1, "Yuvi", "Developer", 30000));
        ems.add(new Employee(2, "John", "Manager", 20000));
        ems.add(new Employee(3, "Alice", "Analyst", 15000));
        System.out.println("All employees:");
        ems.traverse();
        System.out.println("\nDeleting employee with ID 1...");
        ems.delete(1);
        System.out.println("\nEmployees after deletion:");
        ems.traverse();
    }
}