package org.example.geometry3d;


import org.example.exceptions.IncorrectHeightException;
import org.example.exceptions.IncorrectRadiusException;
import org.example.geometry2d.Circle;
import org.example.geometry2d.Figure;
import org.example.geometry2d.Rectangle;

public class Cylinder {
    private Figure base; //Основание цилиндра
    private double height; //Высота цилиндра

    public Cylinder(double radius, double height) throws IncorrectRadiusException, IncorrectHeightException {
        this.base = new Circle(radius); //Проверка внутри Circle
        if (height <= 0) {
            throw new IncorrectHeightException("Invalid height. Height must be greater than zero.");
        } else {
            this.height = height;
        }
    }

    public Cylinder(double width, double length, double height) {
        if (height <= 0 || width <= 0 || length <= 0) {
            throw new IllegalArgumentException("Invalid height. Height must be greater than zero.");
        }

        this.height = height;
        this.base = new Rectangle(width, length);
    }

    public Cylinder(Figure base, double height) throws IncorrectHeightException {
        if (height <= 0) {
            throw new IncorrectHeightException("incorrect height exception");
        }
        if (base == null) {
            throw new NullPointerException("base is null");
        }

        this.base = base;
        this.height = height;
    }

    public double volume() {
        return (base.area() * height); //Объем цилиндра
    }

    @Override
    public String toString() {
        return "Цилиндр с площадью основания:" + base.area() + ", высотой: " + height + ", объемом: " + volume() ;
    }

}
