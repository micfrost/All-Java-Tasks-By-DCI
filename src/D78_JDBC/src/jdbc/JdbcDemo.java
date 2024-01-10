package D78_JDBC.src.jdbc;

public class JdbcDemo {

//    The Driver is getting loaded nowadays automatically. So it is not necessary to do it manually nowadays.
//    Loading class `com.mysql.jdbc.Driver'. This is deprecated. The new driver class is `com.mysql.cj.jdbc.Driver'.
//    The driver is automatically registered via the SPI and manual loading of the driver class is generally unnecessary.

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver class loaded and registered");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
