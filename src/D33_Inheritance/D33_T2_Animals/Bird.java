package D33_Inheritance.D33_T2_Animals;

public class Bird extends Animal{

    String featherColor;

    public Bird(String featherColor){
        this.featherColor=featherColor;
    }

    @Override
    public void makeSound() {
        System.out.println("Sounds of a bird ....---  ---.. ..--- --. ");
    }


}
