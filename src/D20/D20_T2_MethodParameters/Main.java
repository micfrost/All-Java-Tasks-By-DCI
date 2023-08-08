package D20.D20_T2_MethodParameters;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Type the first value: ");
        double scnrV1 = Double.valueOf(scnr.nextLine());
        System.out.println("Type the second value: ");
        double scnrV2 = Double.valueOf(scnr.nextLine());
        System.out.println("Type the third value: ");
        double scnrV3 = Double.valueOf(scnr.nextLine());

        MethodParameters avaregeObj = new MethodParameters();
        double averageVar = avaregeObj.average(scnrV1, scnrV2, scnrV3);

        System.out.println(averageVar);
    }
}
