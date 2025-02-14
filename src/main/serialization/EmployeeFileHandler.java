package serialization;

import java.io.*;
import java.util.List;

public class EmployeeFileHandler {
        private static final String FILE_NAME = "employees.ser";

        public static void saveEmployees(List<Employee> employees) {
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
                oos.writeObject(employees);
                System.out.println(" Employee data saved successfully.");
            } catch (IOException e) {
                System.out.println(" Error saving employee data.");
                e.printStackTrace();
            }
        }

        @SuppressWarnings("unchecked")
        public static List<Employee> loadEmployees() {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
                return (List<Employee>) ois.readObject();
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("❌ Error loading employee data.");
                e.printStackTrace();
                return null;
            }
        }
    }


