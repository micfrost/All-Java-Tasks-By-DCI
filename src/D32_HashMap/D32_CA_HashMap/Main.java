package D32_HashMap.D32_CA_HashMap;

import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        System.out.println();
//                key    value
        HashMap<Integer, String> employeeIDs = new HashMap<>();

        employeeIDs.put(6893, "John");
        employeeIDs.put(1234, "Susan");
        employeeIDs.put(5678, "Joe");
        employeeIDs.put(9876, "Bob");

//        GET (inout key to output value
        System.out.println();
        System.out.println("GET METHOD");
        System.out.println(employeeIDs);
        System.out.println(employeeIDs.get(1234));

        System.out.println();
        System.out.println("CONTAINS METHOD");
        System.out.println(employeeIDs.containsKey(9876));
        System.out.println(employeeIDs.containsValue("George"));

        System.out.println();
        System.out.println("PUT METHOD");
        employeeIDs.put(9876, "GeorgePutInPlaceOfBob");
//        System.out.println(employeeIDs);

        System.out.println();
        System.out.println("REPLACE METHOD");
        employeeIDs.replace(6893, "JohnReplaced");
        employeeIDs.replace(1, "Stella_NewPersonDoesNotCome");
//        System.out.println(employeeIDs);

        System.out.println();
        System.out.println("PUT IF ABSENCE");
        employeeIDs.putIfAbsent(5678, "Bardha-DOESNoT SHOW");
        employeeIDs.putIfAbsent(2, "King-SHOW");
//        System.out.println(employeeIDs);

        System.out.println();
        System.out.println("REMOVING 1234");
        employeeIDs.remove(1234);
//        System.out.println(employeeIDs);

        System.out.println();
        System.out.println("FIRST");
        for(Map.Entry<Integer, String> m: employeeIDs.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }

//      NOT PREFERRED - BETTER <Integer, String>
        System.out.println();
        System.out.println("SECOND");
        for(Map.Entry m: employeeIDs.entrySet()){
            System.out.println(m.getKey() + " " + m.getValue());
        }

//        LAMBDA -> PREFERRED BUT BECAUSE OF LAMBDA WE WILL USE THIS LATER
        System.out.println();
        System.out.println("LAMBDA MAP FOREACH");
        employeeIDs.forEach((key, value) -> System.out.println(key + " " + value));

    }
}
