package D29_LinkedList_D29_CA_LinkedList;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        /*
        - ArrayList uses an Array to store its elements, while LinkedList stores its elements in a doubly-linked-list
        - ArrayList is used more in data reading scenarios. Get elements faster.
        - LinkedList is used more for data addition or deletion. Manipulate faster.

        Most common methods of LinkedList:
        get(index);
        getFirst(index);
        getLast(index);

        add(element);
        add(index, element);
        addFirst(element);
        addLast(element);

        remove(index);
        removeFirst();
        removeLast();
        clear();

         */

        LinkedList<String> linkedList = new LinkedList<>();

//        add an element
        linkedList.add("Item 1");
        linkedList.add("Item 2");
        linkedList.add("Item 3");

//        Printing using normal for
        for (String element : linkedList
        ) {
            System.out.println(element);
        }

//        Printing using for eacj
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("Index " + i + " : " + linkedList.get(i));
        }

//Using Type List provide us better usage of it to use this or subclasses: ArrayList, LinkedList
        List<Integer> numbersList = new ArrayList<>();

        numbersList.add(3);
        numbersList.add(53);
        numbersList.add(125);

    }


    public static void showList(List<Integer> list) {
        for (Integer element : list) {
            System.out.println(element);
        }
    }


}

