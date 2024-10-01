package org.example;

public class Button {
    private int numberClick = 0;

    public void click() {
        numberClick++;
        System.out.println("Click count: " + numberClick);
    }
}
