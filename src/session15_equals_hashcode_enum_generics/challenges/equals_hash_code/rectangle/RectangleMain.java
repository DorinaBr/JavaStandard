package session15_equals_hashcode_enum_generics.challenges.equals_hash_code.rectangle;

public class RectangleMain {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        rectangle1.setWidth(10);
        rectangle1.setHeight(5);

        Rectangle rectangle2 = new Rectangle();
        rectangle2.setWidth(10);
        rectangle2.setHeight(5);

        System.out.println("rectangle1 equals rectangle2: " + rectangle1.equals(rectangle2));
        System.out.println("rectangle1 hash code: " + rectangle1.hashCode());
        System.out.println("rectangle2 hash code: " + rectangle2.hashCode());
    }
}
