package queueinterface.hospitaltriangesystem;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
        public static void main(String[] args) {
            Queue<HospitalTriange> triages=new PriorityQueue<>();
            triages.add(new HospitalTriange(5,"Dev"));
            triages.add(new HospitalTriange(2,"Aditya"));
            triages.add(new HospitalTriange(6,"Ravi"));

            System.out.println("Patients List");
            for (HospitalTriange h:triages){
                System.out.println(h);
            }
            System.out.println("+--------------------------------------+");
            System.out.println("Patients in order");
            while (!triages.isEmpty()){
                System.out.println(triages.poll());
            }
        }
    }


