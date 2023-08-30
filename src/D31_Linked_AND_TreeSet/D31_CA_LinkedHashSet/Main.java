package D31_Linked_AND_TreeSet.D31_CA_LinkedHashSet;

import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        LinkedHashSet<String> colors = new LinkedHashSet<>();

        colors.add("Black");
        colors.add("Gray");
        colors.add("Brown");
        colors.add("Yellow");
        colors.add("Gray");

//        Displaying with inputting order
        int serial = 1;
        for (String element : colors
        ) {
            System.out.print("Serial number: "+ serial + ": ");
            System.out.println(element);
            serial++;
        }




//        checking if a value is in Set
        String searchedColors = "Black";
        boolean isSearchedColors = colors.contains(searchedColors);
        if (isSearchedColors) {
            System.out.println("The color you searched (" + searchedColors + ") exists in a List.");
        }
    }
}
