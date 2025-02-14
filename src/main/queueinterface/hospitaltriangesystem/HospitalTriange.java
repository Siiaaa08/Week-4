package queueinterface.hospitaltriangesystem;

public class HospitalTriange implements Comparable<HospitalTriange>{

        int number;
        String name;
        public HospitalTriange(int number,String name){
            this.number=number;
            this.name=name;
        }

        @Override
        public int compareTo(HospitalTriange o) {
            return Integer.compare(o.number,this.number);
        }
        public String getName(){
            return name;
        }
        @Override
        public String toString(){
            return ("Name of patient :- "+name+"\n Severity :- "+number);
        }

    }


