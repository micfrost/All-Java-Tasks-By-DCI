package D77_enums.CA5_colors_looping;


enum Color {
    RED("Love", 1, 2), GREEN("Health", 1, 2);
    private String meaning;

    Color(String meaning, int i, int i1) {
        this.meaning = meaning;
    }

    public String getMeaning() {
        return meaning;
    }

    public String toString() {
        return "This color means: " + meaning;
    }

    public String getFormattedName() {
        String name = this.name().toLowerCase();
        return name.substring(0, 1).toUpperCase() + name.substring(1);
    }
}
public class Main {


    public static void main(String[] args) {

        Color color = Color.RED;
        System.out.println(color);
        System.out.println(Color.GREEN.getMeaning());
        System.out.println(Color.GREEN.name());
        System.out.println(Color.RED.getFormattedName());

        System.out.println(Color.GREEN.getClass());
        System.out.println(Color.GREEN instanceof Enum);

        Color color1 = Color.valueOf("GREEN");
        System.out.println("Value of GREEN: " + color1);

        for (Color element : Color.values()){
            System.out.println("Colors of Enums: " + element.name() + " and the value is: " + element.getMeaning());
        }




    }


}
