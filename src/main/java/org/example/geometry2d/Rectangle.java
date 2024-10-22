package org.example.geometry2d;

public class Rectangle implements Figure {
    public double wight;
    public double height;

    public Rectangle(double wight, double height) {
        this.wight = wight;
        this.height = height;
    }

    @Override
    public double area() {
        return wight * height;
    }

    @Override
    public String toString() {
        return "Прямоугольник с шириной: " + wight + ", высотой: " + height + ", площадью: " + area();
    }

}
