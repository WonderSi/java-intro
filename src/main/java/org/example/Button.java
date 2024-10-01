package org.example;

public class Button {
    private int numberClick = 0;

    public int click() {
        numberClick++;
        return numberClick;
    }
}
