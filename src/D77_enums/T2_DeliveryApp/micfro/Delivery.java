package D77_enums.T2_DeliveryApp.micfro;

public class Delivery {
    private int deliveryID;
    private String itemName;
    private double itemWeight;
    private Customer customer;
    private DeliveryStatus deliveryStatus;

    public DeliveryStatus getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(DeliveryStatus deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }

    public int getDeliveryID() {
        return deliveryID;
    }

    public void setDeliveryID(int deliveryID) {
        this.deliveryID = deliveryID;
    }

    public Delivery(String itemName, double itemWeight, Customer customer) {
        this.itemName = itemName;
        this.itemWeight = itemWeight;
        this.customer = customer;

    }

    @Override
    public String toString() {
        return "Delivery ID: " + deliveryID +
                "   |   Item Name: " + itemName +
                "   |   Item Weight: " + itemWeight +
                "   |   customerID: " + customer.getCustomerID() +
                "   |   Delivery Status: " + deliveryStatus.getText() ;
    }
}
