package org.example;

public class Button {
    private int numberClick = 0;


    public int getNumberClick() {
        return numberClick;
    }

    public void click() {
        numberClick++;
    }

    public void showNumberClick() {
        System.out.println("Количество нажатий на кнопку: " + getNumberClick());
    }
}
