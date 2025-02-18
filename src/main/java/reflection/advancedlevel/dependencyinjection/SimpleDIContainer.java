package reflection.advancedlevel.dependencyinjection;

import java.lang.reflect.Field;

public class SimpleDIContainer {
        public static void injectDependencies(Object obj) throws Exception {
            Class<?> clazz = obj.getClass();

            for (Field field : clazz.getDeclaredFields()) {
                if (field.isAnnotationPresent(Inject.class)) {
                    field.setAccessible(true);
                    Object dependency = field.getType().getDeclaredConstructor().newInstance(); // Object create kiya
                    field.set(obj, dependency);
                }
            }
        }
    }


