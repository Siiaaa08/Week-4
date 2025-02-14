package serialization;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
        public static void main(String[] args) {
            List<Employee> employees = new ArrayList<>();
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            try {
                System.out.print("Enter number of employees: ");
                int n = Integer.parseInt(reader.readLine());

                for (int i = 0; i < n; i++) {
                    System.out.println("\nEnter details for Employee " + (i + 1) + ":");

                    System.out.print("ID: ");
                    int id = Integer.parseInt(reader.readLine());

                    System.out.print("Name: ");
                    String name = reader.readLine();

                    System.out.print("Department: ");
                    String department = reader.readLine();

                    System.out.print("Salary: ");
                    double salary = Double.parseDouble(reader.readLine());

                    employees.add(new Employee(id, name, department, salary));
                }

                EmployeeFileHandler.saveEmployees(employees);

                List<Employee> loadedEmployees = EmployeeFileHandler.loadEmployees();
                if (loadedEmployees != null) {
                    System.out.println("\n1 Employee List Retrieved from File:");
                    for (Employee emp : loadedEmployees) {
                        System.out.println(emp);
                    }
                }

            } catch (IOException | NumberFormatException e) {
                System.out.println(" Error: Invalid input.");
                e.printStackTrace();
            }
        }
    }


