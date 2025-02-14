package mapinterface.groupprojects;

import java.util.ArrayList;
import java.util.Map;

public class GroupObject {
        public static void information(Map<Department, ArrayList<Employee>> result, Employee e1, Department d1){
            result.putIfAbsent(d1, new ArrayList<>());
            result.get(d1).add(e1);
        }
    }


