package annotation.exerciseproblem.unchecked;

import java.util.ArrayList;
import java.util.List;

public class SuppressMain {
        @SuppressWarnings("unchecked")
        public static void main(String[] args) {
            List arr=new ArrayList();
            arr.add("hello");
            arr.add(43);
            System.out.println("List :- "+arr);
        }
    }


