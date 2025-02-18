package reflection.basiclevel.invokeprivatemethod;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
        public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

            PrivateMethod pm=new PrivateMethod("Saloni Baruaa");
            Class<?>cls= pm.getClass();
            Method method= cls.getDeclaredMethod("privateMethod");

            method.setAccessible(true);
            method.invoke(pm);


        }
    }


