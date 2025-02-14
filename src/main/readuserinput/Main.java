package readuserinput;

public class Main {
        public static void main(String[] args) {
            User user = UserInputHandler.getUserInput();
            if (user != null) {
                UserFileWriter.saveUserToFile(user);
            }
        }
    }


