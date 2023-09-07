package D36_Encapsulation.D36_CA_Encapsulation;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student();

        student1.setAccountNumber(1223345467);
        student1.setName("Jonathan");
        student1.setEmail("Jonathan@gmaiil.coom");
        System.out.println(
                "Account number: " + student1.getAccountNumber() +
                        ", Name: " + student1.getName() +
                        ", Email: " + student1.getEmail()

        );

    }
}
