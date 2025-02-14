package datastreams;

import java.io.*;

public class StudentDataHandler {
        private String fileName;
        public StudentDataHandler(String fileName) {
            this.fileName = fileName;
        }

        public void writeStudentData(int rollNumber, String name, double gpa) {
            try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName, true))) {
                dos.writeInt(rollNumber);
                dos.writeUTF(name);
                dos.writeDouble(gpa);
                System.out.println("Student data written successfully!");
            } catch (IOException e) {
                System.out.println("Error writing to file: " + e.getMessage());
                e.printStackTrace();
            }
        }

        public void readStudentData() {
            try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
                System.out.println("\n📜 Stored Student Details:");
                while (dis.available() > 0) {
                    int rollNumber = dis.readInt();
                    String name = dis.readUTF();
                    double gpa = dis.readDouble();
                    System.out.println("Roll No: " + rollNumber + ", Name: " + name + ", GPA: " + gpa);
                }
            } catch (IOException e) {
                System.out.println("Error reading file: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }


