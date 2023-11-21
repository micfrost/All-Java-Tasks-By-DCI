package D73_SwitchExpressions.CA1_switch_expressions;

public class Main {

    public static String weekDay1(int day) {
        System.out.println("Switch Statement does fall through");
        String weekDay = " ";
        switch (day) {
            case 0:
                weekDay = "Sunday";
                break;
            case 1:
                weekDay = "Monday";
                break;
            case 2:
                weekDay = "Tuesday";
                break;
            case 3:
                weekDay = "Wednesday";
                break;
            default:
                throw new IllegalArgumentException("Invalid option:" + day);
        }
        return weekDay;
    }

    public static String weekDay2(int day) {
        System.out.println("Switch Expressions does not fall through");
        String weekDay = switch (day) {
            case 0 -> {
                System.out.println("More code logic...");
                yield "Sunday";
            }
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            default -> throw new IllegalArgumentException("Invalid option:" + day);
        };
        return weekDay;
    }

    public static void main(String[] args) {
        System.out.println("- - -");
        System.out.println(weekDay2(0));

    }
}