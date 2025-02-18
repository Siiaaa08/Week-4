package annotation.advancedproblems.roleallowed;

import static annotation.advancedproblems.roleallowed.RoleValidator.validate;

public class Main {
        public static void main(String[] args) {
            RoleAllowedCode service=new RoleAllowedCode();
            System.out.println("User with ADMIN role:");
            validate(new RoleAllowedCode(), "task", "Admin");

            System.out.println("\nUser with USER role:");
            validate(new RoleAllowedCode(), "task", "USER");
        }
    }


