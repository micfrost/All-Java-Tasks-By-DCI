package D83_Transaction3.src.main.java;

public class Person {
private Integer ID;
private String name;
private String lastName;
private Integer age;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Person(Integer ID, String name, String lastName, Integer age) {
        this.ID = ID;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }
}
