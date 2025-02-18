package annotation.exerciseproblem.customannotation;

public class Task {
        @TaskInfo(priority = 1,assigned = "Deepak")
        public void task(){
            System.out.println("Task Completed");
        }
    }


