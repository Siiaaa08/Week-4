package readuserinput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInputHandler {
        public static User getUserInput() {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

                System.out.print("Enter your name: ");
                String name = reader.readLine();

                System.out.print("Enter your age: ");
                int age = Integer.parseInt(reader.readLine());

                System.out.print("Enter your favorite programming language: ");
                String language = reader.readLine();

                return new User(name, age, language);

            }
            catch (IOException e) {
                System.out.println(" Error: Input issue occurred.");
                e.printStackTrace();
            }
            catch (NumberFormatException e) {
                System.out.println("Error: Invalid age format. Please enter a number.");
            }
            return null;
        }
    }


