package D33_Inheritance.D33_T3_Employees;

public class Employee {

    String name;
    int employeeID;

    public void setName(String name) {
        this.name=name;
    }
    public void setEmployeeID(int employeeID){
        this.employeeID=employeeID;
    }

    public void calculateSalary(){

    }
    public void displayInfo(){
        System.out.println();
        System.out.println(this.getClass().getSimpleName());
        System.out.printf("Name: %s.\n", this.name);
        System.out.printf("Employee ID: %s.\n", this.employeeID);
        calculateSalary();
    }
}
