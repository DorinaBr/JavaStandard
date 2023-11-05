package session15_equals_hashcode_enum_generics.challenges.equals_hash_code.product;

public class ProductMain {

    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setId(0123);
        product1.setName("green apples");
        product1.setPrice(12.5);

        Product product2 = new Product();
        product2.setId(0123);
        product2.setName("green apples");
        product2.setPrice(12.5);

        System.out.println("product1 equals product2: " + product1.equals(product2));
        System.out.println("product1 haschode: " + product1.hashCode());
        System.out.println("product2 haschode: " + product2.hashCode());

        System.out.println(product1);
    }
}
