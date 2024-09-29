package org.example.geometry2d;

public class Circle implements Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius; //Площадь круга
    }

    @Override
    public String toString() {
        return "Окружность с радиусом: " + radius + ", площадью: " + area();
    }
}
