package D65_Predicate_Function_Unary.DC_T_3_Predicate_Function_Unary.micfro;

public class Employee {
    private String name;
    private String gender;
    private double salary;
    private String department;

    public Employee(String name, String gender, double salary, String department) {
        this.name = name;
        this.gender = gender;
        this.salary = salary;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee: " +
                 name +
                ", \tgender: " + gender +
                ",   \tsalary: " + salary + "€"+
                ", \tdepartment: " + department +
                '.';
    }

    public void setName(String name) {
        this.name = name;
    }



    public void setSalary(double salary) {
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public double getSalary() {
        return salary;
    }}


