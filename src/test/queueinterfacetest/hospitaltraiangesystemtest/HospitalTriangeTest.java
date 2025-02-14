package queueinterfacetest.hospitaltraiangesystemtest;

import org.junit.Assert;
import org.junit.Test;
import queueinterface.hospitaltriangesystem.HospitalTriange;

import java.util.PriorityQueue;
import java.util.Queue;

public class HospitalTriangeTest {

        @Test
        public void Tester(){
            Queue<HospitalTriange> triages=new PriorityQueue<>();
            triages.add(new HospitalTriange(5,"Dev"));
            triages.add(new HospitalTriange(2,"Aditya"));
            triages.add(new HospitalTriange(6,"Ravi"));

            Assert.assertEquals("Ravi", triages.poll().getName());
        }
    }


