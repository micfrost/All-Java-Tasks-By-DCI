package D66_Exercises.DC_T_1_VirtualItems.micfro;

public class MenuItem {

    private String name;
    private double price;
    private int quantity;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name +" \t"+ price + "€.";
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
