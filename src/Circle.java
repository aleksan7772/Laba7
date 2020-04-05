public class Circle {
    private double radiusIsLong;
    private double area;
    private String color;


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


}
