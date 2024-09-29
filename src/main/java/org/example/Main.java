package org.example;


import org.example.geometry2d.Circle;
import org.example.geometry2d.Rectangle;
import org.example.geometry3d.Cylinder;

public class Main {
    public static void main(String[] args) {
        //1
        Button button = new Button();
        button.click();
        button.showNumberClick();
        button.reset();
        button.click();
        button.click();
        button.showNumberClick();

        //2
        Balance balance = new Balance();
        balance.addRight(50);
        balance.addLeft(45);
        balance.result();

        //3
        Bell bell = new Bell();
        bell.sound();
        bell.sound();
        bell.sound();
        bell.sound();

        //4
        OddEvenSeparator sep = new OddEvenSeparator();
        for (int i = 0; i <= 10; i++) {
            sep.addNumber(i);
        }
        sep.even();
        sep.odd();

        //5
        Table table = new Table(3, 3);
        table.setValue(0,0,1);
        table.setValue(1,0,9);
        table.setValue(2,0,5);
        table.setValue(1,2,4);
        table.showTable();
        table.showAverage();

        //6
        //a
        Circle circle = new Circle(2);
        Rectangle rectangle = new Rectangle(3,5);
        System.out.println(circle);
        System.out.println(rectangle);

        //6
        //b
        Cylinder cylinder = new Cylinder(17,140);
        System.out.println(cylinder);

    }
}