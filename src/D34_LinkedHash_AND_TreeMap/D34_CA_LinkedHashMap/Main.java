package D34_LinkedHash_AND_TreeMap.D34_CA_LinkedHashMap;

import java.util.LinkedHashMap;

import java.util.Map;

public class Main {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> months1 = new LinkedHashMap<>();

        months1.put(9, "Sep");
        months1.put(2, "Feb");
        months1.put(11, "Nov");

        for (Map.Entry<Integer, String> element : months1.entrySet()) {
            System.out.println(element.getKey() + ", " + element.getValue());
        }
        System.out.println(months1);

    }
}
