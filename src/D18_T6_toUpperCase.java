public class D18_T6_toUpperCase {
    public static void main(String[] args) {

        String input = "The Quick BroWnFoX jumps over the laZy Dog!";

        System.out.println("Original String: " + input);
        System.out.println("String in uppercase: " + input.toUpperCase());
        input = input.substring(0,18);
        System.out.println("String in lowercase: " + input.toLowerCase() + "!");

    }
}
