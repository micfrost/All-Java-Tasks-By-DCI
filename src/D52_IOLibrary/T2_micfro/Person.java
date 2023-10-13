package D52_IOLibrary.T2_micfro;

public class Person {

//    Implement inheritance by creating a LibraryMember class that inherits from a Person class (you'll need to define the Person class with attributes like name and contact information).

    private String name;

    private String email;
    private String password;

    public Person(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Person: " +
                "name: " + name +
                ", email: " + email +
                ", password: " + password;
    }
}
