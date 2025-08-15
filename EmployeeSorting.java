import java.util.*;

// Main class
public class EmployeeSorting {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        // Adding sample employees
        employees.add(new Employee("John", 30, 55000));
        employees.add(new Employee("Alice", 25, 72000));
        employees.add(new Employee("Bob", 28, 50000));
        employees.add(new Employee("David", 35, 65000));

        System.out.println("--- Original List ---");
        printList(employees);

        // Sorting by Salary (Descending)
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return Double.compare(e2.getSalary(), e1.getSalary()); // Descending
            }
        });
        System.out.println("\n=== Sorted by Salary (Descending) ===");
        printList(employees);

        // Sorting by Name (Ascending)
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getName().compareToIgnoreCase(e2.getName()); // Ascending
            }
        });
        System.out.println("\n=== Sorted by Name (Ascending) ===");
        printList(employees);
    }

    // Utility method to print employee list
    public static void printList(List<Employee> employees) {
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
//Employee class
class Employee {
 private String name;
 private int age;
 private double salary;

 // Constructor
 public Employee(String name, int age, double salary) {
     this.name = name;
     this.age = age;
     this.salary = salary;
 }

 // Getters
 public String getName() {
     return name;
 }

 public int getAge() {
     return age;
 }

 public double getSalary() {
     return salary;
 }

 // toString method for easy display
 @Override
 public String toString() {
     return "Name: " + name + ", Age: " + age + ", Salary: " + salary;
 }
}

