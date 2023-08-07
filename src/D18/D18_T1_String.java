package D18;

import java.util.Scanner;
public class D18_T1_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String secret;
        while (true) {
            System.out.println(" The secret: ");
            secret = scanner.nextLine();
            if (secret.length() >= 8) {
                break;
            } else {
                System.out.println("The secret must be at least 8 characters. One more time.");
            }
        }

        System.out.println(" The Love name: ");
        String loveName = scanner.nextLine();
        System.out.println(" The year of Birth: ");
        String birthYear = scanner.nextLine();



        String concatSecretLoveName = secret.concat(loveName);
        StringBuilder reversedSecret = new StringBuilder();
        reversedSecret.append(concatSecretLoveName);
        reversedSecret.reverse();
        System.out.println("Input \n" + "secret: " + secret + " name: " + loveName + " year: " + birthYear);
        System.out.println("Output \n" + reversedSecret + birthYear);

    }
}

//    The Secret of Love :
//Everyone wants to hide their secrets, especially if those are their love's secrets
//:bulb: To help them we will write a Java function to cipher their secrets.
//The function will ask for three arguments : :secret: the secret , :gift_heart: love name, :birthday: year of birth.
//Secret condition :point_up: : The secret must be at least 8 characters.
//The cipher algorithm is :
//Concatenate the love secret with the love name :arrow_heading_down:
//Reverse the string :arrow_heading_down:
//Concatenate the revered string with the year of birth :arrow_heading_down:
//NOTE: We need to cipher the secret itself , not to create a new ciphered string.
//Input
//secret: this_is_my_secret name: Max year: 1982
//Output
//xaMterces_ym_si_siht1982