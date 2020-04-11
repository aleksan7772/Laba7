package Constructor;

import java.util.Random;

public class Circle {
    private double radiusIsLong;
    private double area;
    private String color;
    {
        Random random = new Random(100);

        radiusIsLong = random.nextDouble();

    }

    public double getRadiusIsLong() {
        return radiusIsLong;
    }

    public void setRadiusIsLong(double radiusIsLong) {
        this.radiusIsLong = radiusIsLong;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Circle(int radiusIsLong, int area, String color) {
        this.radiusIsLong = radiusIsLong ;
        this.color = color;
    }

    public Circle(int radiusIsLong) {
        this.radiusIsLong = radiusIsLong;
    }

    public double area() {
        return this.radiusIsLong * Math.PI;
    }
    public double radius() {
        return (this.radiusIsLong * 2) * Math.PI;
    }

}
