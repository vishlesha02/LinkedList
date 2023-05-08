package Day10;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList<Integer>();

        int indx;
        list.addFirst(56);
        list.add(30);
        list.add(70);
        indx=list.indexOf(30);
        list.add(indx,40);
        indx=list.indexOf(40);
        list.remove(indx);
        System.out.println("The Size of Linked List is : " + list.size());

        Iterator i = list.iterator();

        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}

