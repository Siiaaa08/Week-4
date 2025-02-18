package annotation.exerciseproblem.repeatableannotation;

import java.lang.reflect.Method;

public class Main {
        public static void main(String[] args) {
            try{
                Method method=Software.class.getMethod("process");
                if (method.isAnnotationPresent(BugReport.class)){
                    BugReports br=method.getAnnotation(BugReports.class);
                    for (BugReport b: br.value()){
                        System.out.println("Bugs :- "+b);
                    }
                }

            } catch (NoSuchMethodException e) {
                System.out.println("Error :- "+e.getMessage());
            }

        }
    }


