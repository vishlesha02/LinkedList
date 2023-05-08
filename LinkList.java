package Day10;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList<Integer>();
        list.addFirst(56);
        list.add(30);
        list.add(70);

        Iterator i = list.iterator();
        while (i.hasNext()) {
            if(list.contains(30)){
                System.out.println(i.next());
                break;
            }
        }
    }
}
