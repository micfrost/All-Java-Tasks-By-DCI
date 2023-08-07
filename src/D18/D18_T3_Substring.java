package D18;

public class D18_T3_Substring {
    public static void main(String[] args) {
        String input ="One morning, when Gregor Samsa woke from troubled dreams, "
                + "he found himself transformed in his bed into a horrible vermin."
                + " He lay on his armour-like back, and if he lifted his head a "
                + "little he could see his brown belly, slightly domed and divided by "
                + "arches into stiff sections. The bedding was hardly able to cover "
                + "it and seemed ready to slide off any moment. His many legs, pitifully "
                + "thin compared with the size of the rest of him, waved about helplessly "
                + "as he looked.";

        int ch0 = input.indexOf("H");
        int ch1 = input.indexOf("e");
        int ch2 = input.indexOf("l");
        int ch3 = input.indexOf("o");
        int ch4 = input.indexOf(" ");
        int ch5 = input.indexOf("G");

        System.out.println(input.substring(ch0,(ch0+1)) + input.substring(ch1,(ch1+1)) + input.substring(ch2,(ch2+1)) + input.substring(ch2,(ch2+1)) + input.substring(ch3,(ch3+1)) + input.substring(ch4,(ch4+1)) +  input.substring(ch5,(ch5+6)));

    }
}
