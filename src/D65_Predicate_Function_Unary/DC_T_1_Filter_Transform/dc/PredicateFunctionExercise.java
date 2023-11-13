import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

class Product {
    private String name;
    private double price;
    private String category;

    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Product{" +
               "name='" + name + '\'' +
               ", price=" + price +
               ", category='" + category + '\'' +
               '}';
    }
}

public class PredicateFunctionExercise {
    public static void main(String[] args) {
        // Sample list of products
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop X", 19.99, "Electronics"));
        products.add(new Product("Laptop Z", 29.99, "Electronics"));
        products.add(new Product("Toy X", 14.99, "Toys"));
        products.add(new Product("Book Y", 9.99, "Books"));

        // Objective 1: Filter Products
        Predicate<Product> electronicsFilter = product -> product.getCategory().equals("Electronics");
        List<Product> filteredElectronics = filterProducts(products, electronicsFilter);
        System.out.println("Filtered Electronics Products: " + filteredElectronics);

        // Objective 2: Transform Product Names
        Function<Product, String> toUpperCaseName = product -> product.getName().toUpperCase();
        List<String> transformedNames = transformProductNames(products, toUpperCaseName);
        System.out.println("Transformed Product Names: " + transformedNames);
    }

    // Objective 1: Filter Products
    public static List<Product> filterProducts(List<Product> products, Predicate<Product> filter) {
        List<Product> filteredProducts = new ArrayList<>();
        for (Product product : products) {
            if (filter.test(product)) {
                filteredProducts.add(product);
            }
        }
        return filteredProducts;
    }

    // Objective 2: Transform Product Names
    public static List<String> transformProductNames(List<Product> products, Function<Product, String> transform) {
        List<String> transformedNames = new ArrayList<>();
        for (Product product : products) {
            transformedNames.add(transform.apply(product));
        }
        return transformedNames;
    }
}
