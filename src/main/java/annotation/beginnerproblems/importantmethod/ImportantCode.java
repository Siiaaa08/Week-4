package annotation.beginnerproblems.importantmethod;

public class ImportantCode {
        @ImportantMethod(level = "MEDIUM")
        public void criticalTask() {
            System.out.println("Executing critical task");
        }

        @ImportantMethod(level = "HIGH")
        public void regularTask() {
            System.out.println("Executing regular task");
        }

        public void normalTask() {
            System.out.println("Executing normal task");
        }
    }


