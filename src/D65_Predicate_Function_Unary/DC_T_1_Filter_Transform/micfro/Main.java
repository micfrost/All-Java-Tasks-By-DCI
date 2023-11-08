package D65_Predicate_Function_Unary.DC_T_1_Filter_Transform.micfro;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    // Objective 1: Filter products based on price
    public List<Product> filterProducts(List<Product> products, Predicate<Product> filter) {
        products.removeIf(filter);
        return products;
    }

    public static List<Product> filterProducts2(List<Product> products, Predicate<Product> filterPredicate) {
        List<Product> filteredProducts = new ArrayList<>();
        for (Product product : products) {
            if (filterPredicate.test(product)) {
                filteredProducts.add(product);
            }
        }
        return filteredProducts;
    }

    // Objective 2: Transform product names
    public List<Product> transformProductNames(List<Product> products, Function<Product, String> transformer) {
        products.forEach(p -> p.name = transformer.apply(p));
        return products;
    }

    public static List<String> transformProductNames2(List<Product> products, Function<Product, String> nameTransformer) {
        List<String> transformedNames = new ArrayList<>();
        for (Product product : products) {
            transformedNames.add(nameTransformer.apply(product));
        }
        return transformedNames;
    }

    public static void main(String[] args) {

        Main main = new Main();

        List<Product>  products = new ArrayList<>(List.of(
                new Product("Apple", 5.00),
                new Product("Orange", 7.00),
                new Product("Pear", 2.00),
                new Product("Pommel", 3.00)
                ));

        System.out.println("- - - ");
        System.out.println("Original List");
        products.forEach(System.out::println);

        // Task 1
        System.out.println("- - - ");
        System.out.println("Filtered List");
        List<Product>  filteredProducts = main.filterProducts(products, p -> p.price < (3.8));
        filteredProducts.forEach(System.out::println);

        // Task 2
        System.out.println("- - - ");
        System.out.println("Transformed List");
        List<Product>  transformedProductNames = main.transformProductNames(products, p -> p.name.toUpperCase());
        transformedProductNames.forEach(System.out::println);

    }

}


