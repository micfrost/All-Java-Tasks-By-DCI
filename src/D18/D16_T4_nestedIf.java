package D18;

public class D16_T4_nestedIf {
    public static void main(String[] args) {
        int user = Integer.parseInt(args[0]);
        int id = Integer.parseInt(args[1]);

        if (user == 200) {
            if (id > 100) {
                System.out.println("Valid ID number.");
            } else {
                System.out.println("Invalid ID number.");
            }
        } else {
            System.out.println("You need to be an admin to perform operations.");
        }
    }
}
