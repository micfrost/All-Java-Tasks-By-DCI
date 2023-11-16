package D68_FunctionalProg_Improve.DC_T_1_FP1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Inventory {
    private List<Product> products;

    public Inventory() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayProducts() {
        System.out.println("- - - - - ");
        System.out.println("Inventory:");
        products.forEach(product -> System.out.printf("%s - Price: %.2f€ - Quantity: \n" ,product.getName(), product.getPrice(),product.getQuantity()));
    }

    public void updatePrices(double percentageIncrease) {
        products.stream()
                .map(product -> {
                    double newPrice = product.getPrice() * (1 + percentageIncrease / 100);
                    product.updatePrice(newPrice);
                    return product;
                })
                .collect(Collectors.toList());
    }

    public List<Product> findProductsByPriceRange(double minPrice, double maxPrice) {
        return products.stream()
                .filter(product -> product.getPrice() >= minPrice && product.getPrice() <= maxPrice)
                .collect(Collectors.toList());
    }

    public double calculateAveragePrice() {
        return products.stream()
                .mapToDouble(Product::getPrice)
                .average()
                .orElse(0.0);
    }

    public List<Product> sortProductsByPrice() {
        return products.stream()
                .sorted(Comparator.comparingDouble(Product::getPrice))
                .collect(Collectors.toList());
    }

    public List<Product> removeProductsWithLowQuantities(int minimumQuantity) {
        Predicate<Product> isLessThanMinimumQuantity = product -> product.getQuantity() < minimumQuantity;

        return products.stream()
                .filter(isLessThanMinimumQuantity.negate())
                .collect(Collectors.toList());
    }

}
