package mapinterfacetest.groupprojecttest;

import mapinterface.groupprojects.Department;
import mapinterface.groupprojects.Employee;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static mapinterface.groupprojects.GroupObject.information;

public class GroupObjectsTest {
        @Test
        public void Tester(){
            Map<Department, ArrayList<Employee>> result=new HashMap<>();
            Department d1=new Department("HR");
            Department d2=new Department("Manager");
            Employee e1=new Employee("Dev");
            Employee e2=new Employee("Aditya");
            Employee e3=new Employee("Bunny");
            information(result,e1,d1);
            information(result,e2,d1);
            information(result,e3,d1);
            information(result,e1,d2);
            information(result,e2,d2);
            Assert.assertEquals(2,result.size());

        }
    }


