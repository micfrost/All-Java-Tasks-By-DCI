package D34_LinkedHash_AND_TreeMap.D34_CA_TreeMap;


import java.util.*;
public class Main {
    public static void main(String[] args) {

        TreeMap<Integer, String> months2 = new TreeMap<>();

        months2.put(11, "Nov");
        months2.put(2, "Feb");
        months2.put(9, "Sep");


        for (Map.Entry<Integer, String> element : months2.entrySet()) {
            System.out.println(element.getKey() + ", " + element.getValue());
        }
        System.out.println(months2);
    }
}
