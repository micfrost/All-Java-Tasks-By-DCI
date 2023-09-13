package D38_Polymorphism.D38_T2_CurrencyConverter;
class USD {
    static double convertToUSD(double amount) {
return amount;
    }
}
class EUR {
    static double convertToUSD(double amount) {
return  amount*1.1;
    }
}
class GBP {
    static double convertToUSD(double amount) {
return amount*1.25;
    }
}
public class CurrencyConverter {

    public static void main(String[] args) {
        System.out.println("- - - - - ");
        System.out.println("Currency Converter");
        System.out.println("A currency conversion program using polymorphism and static methods in Java.");
        System.out.println("- - - - - ");

        //        creating array of objects. Every object extents Object class
        Object[] converter= new Object[] {new USD(), new EUR(), new GBP()};
        double amount = 1000;

        //        printing

        for (Object element : converter) {
            if (element instanceof USD) {
                System.out.printf("A Converted amount from %s to USD is: %.2f\n",element.getClass().getSimpleName() ,USD.convertToUSD(amount));
            }
            if (element instanceof EUR) {
                System.out.printf("A Converted amount from %s to USD is: %.2f\n",element.getClass().getSimpleName(), EUR.convertToUSD(amount));
            }
            if (element instanceof GBP) {
                System.out.printf("A Converted amount from %s to USD is: %.2f\n",element.getClass().getSimpleName(), GBP.convertToUSD(amount));
            }
        }

    }
}
