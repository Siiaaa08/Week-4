package reflection.basiclevel.dynamicallycreateobjects;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main{
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?>cls= Example.class;
        Constructor<?> constructor=cls.getDeclaredConstructor(String.class,String.class);

        Object ob=constructor.newInstance("Saloni","There is no tomorrow");

        System.out.println(ob);

    }
}
