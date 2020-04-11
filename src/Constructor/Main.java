package Constructor;

import Constructor.Circle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(62);
        Circle circle1 = new Circle(15, 51, "red");
        System.out.println("Радиус " + circle.getRadiusIsLong());
        System.out.println("Цвет " + circle1.getColor());
        System.out.println("Площадь окружности равна  "+  circle.area());
        System.out.println("Длина окружности равна " + circle.radius());
    }



}
