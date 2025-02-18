package reflection.basiclevel.accessprivatefield;

import java.lang.reflect.Field;

public class Main {
        public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {


            Class<?> cls=PrivateField.class;

            Field field= cls.getDeclaredField("age");

            field.setAccessible(true);
            field.set(null,18);

            System.out.println(field.get(null));




        }
    }


