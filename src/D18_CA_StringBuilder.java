public class D18_CA_StringBuilder {
//    mutable (String class is immutable)
//    newer than StringBuffer (Java 1.5)
//    faster than StringBuffer
//    not thread-safe
    public static void main(String[] args) {
        StringBuilder givenText = new StringBuilder("Oh my God! It is raining!");
        givenText.append("!!");
        givenText.reverse();
        System.out.println(givenText);

    }
}
