package D44_RuntimeExceptions.T1_ProductInventorySystem;

import java.util.*;

public class Inventory {
    // encapsulation
    private Map<Integer, Product> iventoryMap;

    public Inventory() {
        iventoryMap = new HashMap<>();
    }

    void addProduct(Product product) {
        iventoryMap.put(product.getProductId(), product);
    }

    //    without throwing (using default)
    String getProductDetailsDefaultThrow(int productId) {
        try {
            return iventoryMap.get(productId).toString();
        } catch (NullPointerException npeD) {
            return "Default Exception. Product not found.";
        }
    }

    //    with throwing a custom exception
    String getProductDetailsCustomThrow(int productId) {
        try {
            if (iventoryMap.get(productId) != null) {
                return iventoryMap.get(productId).toString();
            } else {
                throw new NullPointerException("Custom Exception. Product unfortunately not found.");
            }
        } catch (NullPointerException npeC) {
            return npeC.getMessage();
        }
    }
}
