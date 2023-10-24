package D18;

public class D18_T7_replaceAll {
    public static void main(String[] args) {
        String input = "DC_T_1_ReantrantLock_Inside dogmatic dog buys dogecoin to become rich and buy hotdogs every day.";
        String output = input.replaceAll("dog ", "cat ");

        System.out.println("input --> output\n " + input + " --> " + output);


    }
}
//7. replaceAll() in java
//        Overview:
//        The replaceAll() method replaces each substring of this string that matches the given string. For now we'll ignore the regular expression capabilites.
//        Task
//        Write a program that replaces the standalone "dog" in the following sentence with "cat".
//        Input/Output
//        "DC_T_1_ReantrantLock_Inside dogmatic dog buys dogecoin to become rich and buy hotdogs every day." --> "DC_T_1_ReantrantLock_Inside dogmatic cat buys dogecoin to become rich and buy hotdogs every day."