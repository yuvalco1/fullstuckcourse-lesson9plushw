package shapes;

public class Triangle implements Shape2{

    private double sidea, sideb,sidec;

    public Triangle(double sidea, double sideb, double sidec) {
        this.sidea = sidea;
        this.sideb = sideb;
        this.sidec = sidec;
    }

    @Override
    public double getArea() {
        double s = (sidea+sideb+sidec)/2;

        return Math.sqrt(s*(s-sidea)*(s-sideb)*(s-sidec));
    }

    @Override
    public double getPerimeter() {
        return (sidea+sideb+sidec);
    }
}
