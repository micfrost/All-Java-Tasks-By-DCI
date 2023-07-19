public class D16_T5_Switch {
    public static void main(String[] args) {
        String userType = args[0];

        switch (userType) {
            case "superAdmin":
                System.out.println("Logged in as a Super Admin, with all the super powers.");
                break;
            case "admin":
                System.out.println("Logged in as an Admin, with all the admin powers.");
                break;
            case "user":
                System.out.println("Logged in a regular folk.");
                break;
            case "guest":
                System.out.println("Logged in as guest. Would you mind signing in?");
                break;
            default:
                System.out.println("User type not recognized!");
                break;
        }
    }
}