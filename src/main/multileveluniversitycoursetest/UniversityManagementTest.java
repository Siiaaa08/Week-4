package multileveluniversitycoursetest;

import multileveluniversitycourse.Course;
import multileveluniversitycourse.ExamCourse;
import org.junit.Assert;
import org.junit.Test;

public class UniversityManagementTest {
        @Test
        public void tester1(){
            ExamCourse examCourse1=new ExamCourse("Mathematics 2");
            Course<ExamCourse> examCourseList=new Course<>();
            examCourseList.addItem(examCourse1);
            Assert.assertEquals(1,examCourseList.getList().size());
        }


    }


