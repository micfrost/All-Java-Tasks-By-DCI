package D33_Inheritance.D33_T2_Animals;

public class Animal {

   private String name;
   private int age;

   public void setName(String name){
       this.name=name;
   }
    public void setAge(int age){
        this.age=age;
    }
    public void makeSound(){
    }
    public void displayInfo() {
        System.out.println();
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        makeSound();
    }
}
