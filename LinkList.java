package Day10;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList<Integer>();

        int indx = 1;
        list.addFirst(56);
        list.add(30);
        list.add(70);
        indx = list.indexOf(30);
        list.add(indx, 40);

        Iterator i = list.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
