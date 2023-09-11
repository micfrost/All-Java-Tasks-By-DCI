package D37_Interfaces.D37_CA3_DefaultMethods;

interface Shape {

//    it is considered abstract this is why it has not body
    void draw();

//    represents a method which have a body
    default void msg(){
        System.out.println("Default Method.");
    }


}
