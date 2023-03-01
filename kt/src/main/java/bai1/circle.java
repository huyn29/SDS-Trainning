package bai1;

public class circle {
    public static final double PI = 3.14;
    private double radius = 1;

    public circle() {
    }

    public circle(double radius) {
        if(radius < 0){
            throw new RuntimeException("Error");
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius < 0){
            throw new RuntimeException("Error");
        }
        this.radius = radius;
    }

    public double getArea() {
        return PI * radius * radius;
    }

    public double getCircumference() {
        return 2*PI*radius;
    }

    @Override
    public String toString() {
        return "circle[" +
                "radius=" + radius +
                ']';
    }
}
