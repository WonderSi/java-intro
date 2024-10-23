package org.example.geometry2d;

import org.example.exceptions.IncorrectRadiusException;

public class Circle implements Figure {
    private double radius; //Радиус коружности

    public Circle(double radius) throws IncorrectRadiusException {
        if (radius <= 0) {
            throw new IncorrectRadiusException("Incorrect Radius. Radius must be greater than zero.");
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

