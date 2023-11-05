package session15_equals_hashcode_enum_generics.challenges.cache_simulated;


import java.util.HashSet;
import java.util.Set;

public class ProductCache {

    public static void main(String[] args) {
        Product product1 = new Product("Soap", "Face");
        Product product2 = new Product("Tooth paste", "Whitening");
        Product product3 = new Product("Soap", "Face");
        Product product4 = new Product("Shower gel", "Hydrating");
        Product product5 = new Product("Tooth paste", "Whitening");

        Set<Product> productSet = new HashSet<>();
        productSet.add(product1);
        productSet.add(product2);
        productSet.add(product3);
        productSet.add(product4);
        productSet.add(product5);

        System.out.println(productSet);
    }
}
