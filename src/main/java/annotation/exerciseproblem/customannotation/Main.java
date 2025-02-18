package annotation.exerciseproblem.customannotation;

import java.lang.reflect.Method;

public class Main {
        public static void main(String[] args) throws NoSuchMethodException {
            Task person=new Task();
            Method method= person.getClass().getMethod("task");

            if(method.isAnnotationPresent(TaskInfo.class)){
                TaskInfo taskInfo=method.getAnnotation(TaskInfo.class);
                System.out.println("Priority :- "+taskInfo.priority());
                System.out.println("Assigned :- "+taskInfo.assigned());
            }

            person.task();

        }
    }


