
public class DRY {

    // Without DRY principle - area is calculated first and then returned
    public void calculateArea() {
        double area = 3.14 * 5 * 5;
        System.out.println("Area of Circle: " + area);

        double areaRectangle = 10 * 20;
        System.out.println("Area of Rectangle: " + areaRectangle);
    }

    // With DRY principle
    public class AreaCalculator {

        public double calculateCircleArea(double radius) {
            return Math.PI * radius * radius;
        }

        public double calculateRectangleArea(double length, double width) {
            return length * width;
        }
    }

}
