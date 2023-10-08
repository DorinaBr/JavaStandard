package session11_abstract.challenges.areas;

import java.text.DecimalFormat;

public class Area extends Shape {
    DecimalFormat decimalFormat = new DecimalFormat("##.0");
    @Override
    void rectangleArea(double length, double width) {
        System.out.println("The rectangle's area is: " + (length * width));
    }

    @Override
    void squareArea(double side) {
        System.out.println("The square's area is : " + (side * side));
    }

    @Override
    void circleArea(double radius) {
        System.out.println("The circle's area is: " +decimalFormat.format(Math.PI * Math.pow(radius, 2)));
    }
}
