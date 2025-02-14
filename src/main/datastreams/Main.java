package datastreams;
import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String fileName = "students.dat";
            StudentDataHandler handler = new StudentDataHandler(fileName);

            while (true) {
                System.out.println("\n Menu:");
                System.out.println("1. Add Student");
                System.out.println("2. Display Students");
                System.out.println("3. Exit");
                System.out.print("Enter choice: ");

                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Enter Roll Number: ");
                        int rollNumber = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter GPA: ");
                        double gpa = scanner.nextDouble();

                        handler.writeStudentData(rollNumber, name, gpa);
                        break;

                    case 2:
                        handler.readStudentData();
                        break;

                    case 3:
                        System.out.println("Exiting...");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            }
        }
    }


