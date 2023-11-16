package D69_DoubleCollon.DC_CA_2_1_Instance_method;

import java.util.ArrayList;
import java.util.List;

public class Car {

// Instance methods
//    Syntax: ObjectOfClass::methodName)

//    this is not a static method. it is not a class method.
//    this method is defined for an instance of a class, for an object.
    void brands(String s) {
        System.out.println(s);
    }


    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Volvo");
        list.add("BMW");
        list.add("Mercedes");

list.forEach(new Car()::brands);
    }
}
