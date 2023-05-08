package Day10;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList<Integer>();
        list.addFirst(56);
        list.add(30);
        list.add(70);
        list.removeFirst();
        Iterator i = list.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
