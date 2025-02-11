package aidrivenresumescreeningtest;

import aidrivenresumescreening.DataScientist;
import aidrivenresumescreening.Resume;
import org.junit.Assert;
import org.junit.Test;


public class AIDrivenResumeTest {
        @Test

        public void tester1(){
            DataScientist dataScientist1=new DataScientist("Dev","Data Scientist","9691876623");
            Resume<DataScientist> dataScientistResume=new Resume<>();
            dataScientistResume.addItem(dataScientist1);

            Assert.assertEquals(1,dataScientistResume.getList().size());

        }
    }


