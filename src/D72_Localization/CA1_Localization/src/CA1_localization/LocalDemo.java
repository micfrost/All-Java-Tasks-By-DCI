package CA1_localization;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocalDemo {

    /*Locale - will help us store the language, country, etc.
    ResourceBundle - will fetch the files to the Locale object.

    public static void main(String[] args) {
     */

    public static void main(String[] args) {

        String language = "ge";
        String country = "GE";

        Locale locale = new Locale(language, country);
        ResourceBundle resourceBundle = ResourceBundle.getBundle("CA1_localization/config",locale);


String string = resourceBundle.getString("BirthdayMsg");

        System.out.println(string);
    }
}
