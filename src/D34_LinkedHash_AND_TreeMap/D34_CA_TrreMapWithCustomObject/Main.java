package D34_LinkedHash_AND_TreeMap.D34_CA_TrreMapWithCustomObject;


import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("ORDER ACCORDING INTEGER");
        TreeMap<Integer, Student> studentTreeMap = new TreeMap<>();
        studentTreeMap.put(4, new Student(1007, "Jonathan"));
        studentTreeMap.put(3, new Student(1002, "Diana"));
        studentTreeMap.put(45, new Student(1003, "Elton"));
        System.out.println(studentTreeMap);

        System.out.println();
        System.out.println("ORDER CUSTOM STUDENT INTEGER");
        TreeMap<Student, Integer> studentTreeMap2 = new TreeMap<>();
        studentTreeMap2.put(new Student(1007, "Jonathan"), 4);
        studentTreeMap2.put(new Student(1002, "Diana"),3);
        studentTreeMap2.put(new Student(1003, "Elton"),45);

        System.out.println(studentTreeMap2);
    }
    }

