package customexception;

public class InvalidAge {
        public static void validAge(int age) throws CustomException{

            if(age<18){
                throw new CustomException("You are not Eligible");

            }
            System.out.println("Assess granted!");

        }

        public static void valid(int age){
            try {
                if (age < 18) {
                    throw new Exception("Age must be 18 or above");
                }
                System.out.println("Access granted!");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

