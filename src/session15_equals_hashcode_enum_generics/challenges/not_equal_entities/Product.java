package session15_equals_hashcode_enum_generics.challenges.not_equal_entities;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.Objects;
import java.util.UUID;

public class Product {

    private final String id = UUID.randomUUID().toString();
    private final Timestamp timestamp = Timestamp.from(Instant.now());
    private String name;

    public Product(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(getId(), product.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Product: " +
                "id='" + id + '\'' +
                ", timestamp=" + timestamp +
                ", name='" + name ;
    }
}
