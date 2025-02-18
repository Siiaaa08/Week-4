package reflection.intermediatelevel.retrieveannotations;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
        public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
            Annotation anon=new Annotation("Cosmos");
            Class<?> cls=anon.getClass();

            if(cls.isAnnotationPresent(Author.class)) {
                Author auth=cls.getDeclaredAnnotation(Author.class);
                System.out.println("Author: "+auth.name());


                Constructor<?> constructor = cls.getDeclaredConstructor(String.class);
                Object ob = constructor.newInstance("Big Bro Universe");

                System.out.println(ob);
            }
            else{
                System.out.println("Cant find anontation");
            }


        }
    }


