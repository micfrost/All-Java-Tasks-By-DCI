package D44_RuntimeExceptions.T1_ProductInventorySystem;

import java.util.*;

public class Inventory {

    Map<Integer, Product> iventoryMap = new HashMap<>();

    void addProduct(Product product) {
        iventoryMap.put(product.getProductId(), product);
    }

    String getProductDetails(int productId) {
        try {
            return iventoryMap.get(productId).toString();
        } catch (NullPointerException npe) {
            return "Product not found.";
        }
    }
}
