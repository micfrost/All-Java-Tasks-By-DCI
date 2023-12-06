package D77_enums.CA1_constans_switch;

//enumerated - something you can count

public class Main {

    public static final int MONDAY = 1;
    public static final int TUESDAY = 2;
    public static final int WEDNESDAY = 3;

    public static void main(String[] args) {

int day = 2;
        switch (day) {
            case MONDAY:
                System.out.println("Monday is a not nice day.");
                break;
            case TUESDAY:
                System.out.println("Tuesday is a nice day");
                break;
        }
    }
}
