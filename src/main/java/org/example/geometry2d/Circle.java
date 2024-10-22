package org.example.geometry2d;

import org.example.exceptions.IncorrectRadius;

public class Circle implements Figure {
    private double radius; //Радиус коружности

    public Circle(double radius) throws IncorrectRadius {
        if (radius <= 0) {
            throw new IncorrectRadius("Incorrect Radius. Radius must be greater than zero.");
        } else {
            this.radius = radius;
        }
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
