package D69_DoubleCollon.DC_CA_2_3_Instance_method_custom_object;

import java.util.ArrayList;
import java.util.List;

class Person{

    String name;

    public Person(String name) {
        this.name = name;
    }

    void someMethod() {
        System.out.println(this.name);
    }


}


public class Main {

//    Custom Object
//    Syntax: (ClassName::methodName)

    public static void main(String[] args) {

        List<Person> list = new ArrayList<>();
        list.add(new Person("Emmanuel"));
        list.add(new Person("Albert"));
        list.add(new Person("Maria"));

        list.forEach(Person::someMethod);
    }

}
