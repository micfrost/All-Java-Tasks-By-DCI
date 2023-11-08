package D65_Predicate_Function_Unary.DC_CA_4_ReplaceAll;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        var valuesList = new ArrayList<>(List.of(2,3,5,6,8,9));
        valuesList.replaceAll(n -> n*n);
        valuesList.forEach(System.out::println);


        var namesList = new ArrayList<>(List.of("Maya", "Bov" , "Carly", "Otton"));
        namesList.replaceAll(n -> "Hi " + n);
        namesList.forEach(System.out::println);

    }


}
