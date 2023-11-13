package D67_Stream.DC_CA_4_Stream_Colectors;


public class Color {

    private String color;

    public Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Color: " + color;
    }
}
