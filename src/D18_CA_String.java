public class D18_CA_String {
    public static void main(String[] args) {

        String givenText = "Please locate where \"locate\" occurs.";
        int indexOfSearch = givenText.indexOf("locate");
        System.out.println("The Index of word \"locate\" is: " + indexOfSearch);
        System.out.println("The rest of the text from this index: " + givenText.substring(indexOfSearch));
    }
}
