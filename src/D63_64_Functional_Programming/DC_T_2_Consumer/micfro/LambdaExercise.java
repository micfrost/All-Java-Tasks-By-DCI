package D63_64_Functional_Programming.DC_T_2_Consumer.micfro;

import java.util.ArrayList;
import java.util.List;

public class LambdaExercise {
    // Custom functional interface for string operations
    @FunctionalInterface
    interface StringOperation {
        String operate(String inputString);
    }


    // Custom functional interface for data processing
    @FunctionalInterface
    interface DataProcessor {
        void process(String stringElement);
    }


    public static void processData(List<String> listOfString, DataProcessor dataProcessor) {
        for (String stringElement : listOfString) {
            dataProcessor.process(stringElement);
        }
    }


    public static void main(String[] args) {
        // Create a list of data strings
        List<String> listOfString = new ArrayList<>();
        listOfString.add("tree");
        listOfString.add("water");
        listOfString.add("air");

        // Define a lambda expression to convert each data string to uppercase
      StringOperation stringOperation = inputString -> inputString.toUpperCase();

//        instance of DataProcessor with a definition of implementation
//        we define a method process just as a printed version of an operate method
        DataProcessor dataProcessor = stringElement ->
                System.out.println(stringOperation.operate(stringElement));

        // Call the processData method to apply the conversion operation using a Consumer
        processData(listOfString, dataProcessor);
    }
}