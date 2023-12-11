public class Circle extends Shape{


    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }



    @Override
    public double area() {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public double perimeter() {
        return Math.PI * 2 * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
