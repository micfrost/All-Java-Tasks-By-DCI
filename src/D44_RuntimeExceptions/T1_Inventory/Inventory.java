package D44_RuntimeExceptions.T1_Inventory;

import java.util.HashMap;

class Inventory {

    HashMap<Integer, Product> productMap = new HashMap<>();


    public void addProduct(Product product) {
        productMap.put(product.getProductID(), product);
    }

    public String getProductDetails(int productID) {

        try {
            Product product = productMap.get(productID);

            if (product != null) {
                return product.toString();
            } else {
                throw new NullPointerException("Product not found.");
            }
        } catch (NullPointerException e) {
            return e.getMessage();
        }


    }
}
