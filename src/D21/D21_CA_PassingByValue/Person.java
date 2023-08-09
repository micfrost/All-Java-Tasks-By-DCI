package D21.D21_CA_PassingByValue;

public class Person {
    String name;

    public Person(String name) { // Constructor of the class
        super();
        this.name = name; // this is a key word to make equal the variables
    }

    public String getName() { // get() method
        return name;
    }

    public void setName(String name) { // set() method
        this.name = name;
    }


    public String toString() {
        return "Person [name=" + name + "]";
    }
}
