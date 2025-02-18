package annotation.advancedproblems.roleallowed;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RoleValidator {
        public static void validate(Object obj,String methodName,String role){
            try {
                Method method=obj.getClass().getMethod(methodName);

                if(method.isAnnotationPresent(RoleAllowed.class)){
                    RoleAllowed roleAllowed=method.getAnnotation(RoleAllowed.class);

                    if(roleAllowed.value().equals(role)){
                        method.invoke(obj);
                    }
                    else {
                        System.out.println("Access Denied! Only " + roleAllowed.value() + " can access this method.");
                    }
                } else {
                    method.invoke(obj);
                }

            } catch (NoSuchMethodException e) {
                System.out.println("Error :- "+e.getMessage());;
            } catch (InvocationTargetException e) {
                System.out.println("Error :- "+e.getMessage());;
            } catch (IllegalAccessException e) {
                System.out.println("Error :- "+e.getMessage());;
            }
        }
    }


