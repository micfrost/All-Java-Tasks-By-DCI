package D18;

public class D18_T9_Join {
    public static void main(String[] args) {

        String[] inputList = {"bananas", "apples", "milk"};

        System.out.println("input --> output");



        System.out.print(inputList[0] + ", " + inputList[1] + ", " + inputList[2]);

        System.out.print(" --> ");

        String outputList = String.join(",", inputList);

        System.out.println(outputList);
    }
}
