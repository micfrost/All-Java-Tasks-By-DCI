package D65_Predicate_Function_Unary.DC_T_1_Filter_Transform.micfro;

public class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + "\t- " + price + "€.";
    }
}
