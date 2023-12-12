package D77_enums.T2_DeliveryApp.micfro;

public enum DeliveryStatus {
    DELIVERED("Delivered successfully."),
    IN_DELIVERY("In progress.");

    private String text;

    DeliveryStatus(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
