package D39_Casting.D39_CA2_valueOf;

public class Main {
    public static void main(String[] args) {

        System.out.println(" ");
        System.out.println("String valueOf() method");
        int value=30;
        String text = String.valueOf(value);
        System.out.println(text);
        System.out.println(text + 40);
        System.out.println(" ");

        boolean boolean1 = true;
        boolean boolean2 = false;

        String text1 = String.valueOf(boolean1);
        String text2 = String.valueOf(boolean2);

        System.out.println(text1);
        System.out.println(text2);

    }
}
