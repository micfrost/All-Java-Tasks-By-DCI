package D77_enums.T2_DeliveryApp.micfro;

public class Customer {
    private  int customerID;
    private  String customerName;
    private  String Address;

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }


    public Customer(String customerName, String address) {
        this.customerName = customerName;
        Address = address;
    }

    @Override
    public String toString() {
        return "Customer ID: " + customerID +
                "   |   Name: " + customerName +
                "   |   Address: " + Address;
    }
}
