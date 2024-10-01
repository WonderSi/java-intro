package org.example.geometry3d;


import org.example.exceptions.IncorrectHeight;
import org.example.exceptions.IncorrectRadius;
import org.example.geometry2d.Circle;

public class Cylinder {
    private Circle base; //Основание цилиндра
    private double height; //Высота цилиндра

    public Cylinder(double radius, double height) throws IncorrectRadius, IncorrectHeight {
        this.base = new Circle(radius); //Проверка внутри Circle
        if (height <= 0) {
            throw new IncorrectHeight("Invalid height. Height must be greater than zero.");
        } else {
            this.height = height;
        }
    }

    public double volume() {
        return (base.area() * height); //Объем цилиндра
    }

    @Override
    public String toString() {
        return "Цилиндр с площадью основания:" + base.area() + ", высотой: " + height + ", объемом: " + volume() ;
    }
}
