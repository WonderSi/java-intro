package org.example.geometry3d;


import org.example.geometry2d.Circle;
import org.example.geometry2d.Rectangle;

public class Cylinder {
    private Circle radius; //основание цилиндра
    private Rectangle height; //высота цилиндра

    public Cylinder(double radius, double height) {
        this.radius = new Circle(radius);
        this.height = new Rectangle(0, height);
    }

    public double volume() {
        return radius.area() * height.height; //Объем цилиндра
    }

    @Override
    public String toString() {
        return "Цилиндр с площадью основания:" + radius.area() + ", высотой: " + height.height + ", объемом: " + volume() ;
    }
}
