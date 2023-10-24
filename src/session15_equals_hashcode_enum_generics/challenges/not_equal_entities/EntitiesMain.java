package session15_equals_hashcode_enum_generics.challenges.not_equal_entities;

import java.util.HashSet;
import java.util.Set;

public class EntitiesMain {

    public static void main(String[] args) {
        Product product1 = new Product("Bubble gum");
        Product product2 = new Product("Bubble gum");
        Product product3 = new Product("Bubble gum");

        Set<Product> products = new HashSet<>();
        products.add(product1);
        products.add(product2);
        products.add(product3);

        System.out.println("The product set is: ");

        for (Product product : products) {
            System.out.println(product);
        }

        System.out.println("Product set size is: " + products.size());
    }
}
