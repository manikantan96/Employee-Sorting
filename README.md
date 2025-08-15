# 🧑‍💼 EmployeeSorting

A simple Java application that demonstrates how to sort a list of employees based on different attributes using custom comparators.

## 📋 Features

- Stores employee data (name, age, salary)
- Sorts employees by:
  - **Salary (Descending)**
  - **Name (Ascending)**
- Displays the original and sorted lists

## 🛠️ Technologies Used

- Java Standard Edition (Java SE)
- `ArrayList` for dynamic data storage
- `Collections.sort()` with custom `Comparator`

## 📦 How to Run

1. **Clone or download** the repository.
2. Compile the Java files:
   ```bash
   javac EmployeeSorting.java
   ```
3. Run the program:
   ```bash
   java EmployeeSorting
   ```

## 📄 Sample Output

```
--- Original List ---
Name: John, Age: 30, Salary: 55000.0
Name: Alice, Age: 25, Salary: 72000.0
Name: Bob, Age: 28, Salary: 50000.0
Name: David, Age: 35, Salary: 65000.0

=== Sorted by Salary (Descending) ===
Name: Alice, Age: 25, Salary: 72000.0
Name: David, Age: 35, Salary: 65000.0
Name: John, Age: 30, Salary: 55000.0
Name: Bob, Age: 28, Salary: 50000.0

=== Sorted by Name (Ascending) ===
Name: Alice, Age: 25, Salary: 72000.0
Name: Bob, Age: 28, Salary: 50000.0
Name: David, Age: 35, Salary: 65000.0
Name: John, Age: 30, Salary: 55000.0
```

## 📚 Code Structure

- `EmployeeSorting.java`: Main class that initializes and sorts the employee list.
- `Employee`: A simple POJO (Plain Old Java Object) representing an employee with `name`, `age`, and `salary`.

## 🚀 Future Enhancements

- Add sorting by age
- Allow user input for dynamic employee creation
- Export sorted data to a file

---
