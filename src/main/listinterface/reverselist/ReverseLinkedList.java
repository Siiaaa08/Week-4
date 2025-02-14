package listinterface.reverselist;

import java.util.LinkedList;

public class ReverseLinkedList<T> {
    public void reverse(LinkedList<T> list){
        LinkedList<T> tempList = new LinkedList<>();
        for(T element : list){
            tempList.addFirst(element);
        }
        list.clear();
        list.addAll(tempList);
    }
}
