package annotation.intermediateproblems.logging;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
        public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
            LogExecutionTimeCode task=new LogExecutionTimeCode();
            Class<?> obj=task.getClass();

            Method[] methods=obj.getDeclaredMethods();

            for (Method method : methods) {
                if (method.isAnnotationPresent(LogExecutionTime.class)) {
                    long startTime = System.nanoTime();
                    method.invoke(task);
                    long endTime = System.nanoTime();

                    long executionTime = (endTime - startTime) / 1_000_000;

                    System.out.println("Execution Time of " + method.getName() + ": " + executionTime + " ms");
                    System.out.println("----------------------------------");
                }
            }
        }
    }


