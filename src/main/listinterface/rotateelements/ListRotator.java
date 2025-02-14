package listinterface.rotateelements;

import java.util.ArrayList;
import java.util.List;

public class ListRotator<T>{
    public void rotate(List<T> list, int positions){
        int n = list.size();
        positions = positions%n;
        if(positions<0){
            positions += n;
        }
        List<T> rotatedPart = new ArrayList<>(list.subList(positions,n));
        rotatedPart.addAll(list.subList(0,positions));

        list.clear();
        list.addAll(rotatedPart);
    }
}
