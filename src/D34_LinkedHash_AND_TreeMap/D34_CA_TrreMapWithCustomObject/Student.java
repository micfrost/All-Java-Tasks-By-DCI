package D34_LinkedHash_AND_TreeMap.D34_CA_TrreMapWithCustomObject;


import java.util.Objects;

//Instance Variables
public class Student implements Comparable<Student> {
    Integer id;
    String name;

    // Parameters
    public Student(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name='" + name + '\'' + '}';
    }



    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }


//// Sort by Integer ID
    @Override
    public int compareTo(Student other) {
        return ((Integer)id).compareTo(other.id);
    }

    // Sort by Name
//    @Override
//    public int compareTo(Student other) {
//        return name.compareTo(other.name);
//    }

}
