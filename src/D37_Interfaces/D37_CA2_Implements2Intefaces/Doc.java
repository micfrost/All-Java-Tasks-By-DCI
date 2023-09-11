package D37_Interfaces.D37_CA2_Implements2Intefaces;

public class Doc implements Print, Display {
    @Override
    public void display() {
        System.out.println("Display only.");
    }

    @Override
    public void print() {
        System.out.println("Printing...");
    }




}
