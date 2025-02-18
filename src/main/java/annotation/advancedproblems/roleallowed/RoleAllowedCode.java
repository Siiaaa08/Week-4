package annotation.advancedproblems.roleallowed;

public class RoleAllowedCode {
        @RoleAllowed("Admin")
        public void task(){
            System.out.println("Admin Task!");
        }
    }


