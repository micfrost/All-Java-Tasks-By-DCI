//package D74_WEEKLYQUICKLY.src.test;
//
//import main.ShopOrderSystem;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import java.io.ByteArrayInputStream;
//import java.io.InputStream;
//
//import static org.junit.jupiter.api.Assertions.assertThrows;
//
//
//public class ShopOrderSystemTest {
//
//    private ShopOrderSystem shopOrderSystem;
//
//    @BeforeEach
//    public void setUp() {
//        shopOrderSystem = new ShopOrderSystem();
//    }
//
//    @Test
//    public void testPayTheBill_WithNegativePayment() {
//
//        String input = "-5.0\n";
//        InputStream in = new ByteArrayInputStream(input.getBytes());
//        System.setIn(in);
//
//        ShopOrderSystem shopOrderSystem = new ShopOrderSystem();
//
//        assertThrows(Exception.class, () -> shopOrderSystem.payTheBill());
//    }
//
//}

