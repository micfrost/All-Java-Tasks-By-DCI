package D33_Inheritance.D33_T2_Animals;

public class Bird extends Animal{

    String featherColor;

    public Bird(String featherColor){
        this.featherColor=featherColor;
    }

    @Override
    public void makeSound() {
        System.out.printf("Sounds of a %s ....---  ---.. ..--- --. \n", this.name);
    }

    public void displayInfo() {

        super.displayInfo();
        System.out.println("Feather color: " + this.featherColor);
    }

}
