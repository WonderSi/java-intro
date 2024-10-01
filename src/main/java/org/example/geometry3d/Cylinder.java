package org.example.geometry3d;


import org.example.exceptions.InvalidIncorrectHeight;
import org.example.exceptions.InvalidIncorrectRadius;
import org.example.geometry2d.Circle;

public class Cylinder {
    private Circle radius; //Основание цилиндра
    private double height; //Высота цилиндра

    public Cylinder(double radius, double height) throws InvalidIncorrectRadius, InvalidIncorrectHeight {
        this.radius = new Circle(radius); //Проверка внутри Circle
        if (height <= 0) {
            throw new InvalidIncorrectHeight("Invalid height. Height must be greater than zero.");
        } else {
            this.height = height;
        }
    }

    public double volume() {
        return radius.area() * height; //Объем цилиндра
    }

    @Override
    public String toString() {
        return "Цилиндр с площадью основания:" + radius.area() + ", высотой: " + height + ", объемом: " + volume() ;
    }
}
