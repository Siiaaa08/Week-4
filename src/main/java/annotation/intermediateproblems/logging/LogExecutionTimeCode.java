package annotation.intermediateproblems.logging;

public class LogExecutionTimeCode {
        @LogExecutionTime
        public void quickTask1() {
            System.out.println("Executing quick task1.");
        }
        @LogExecutionTime
        public void quickTask2() {
            System.out.println("Executing quick task2.");
        }

    }


