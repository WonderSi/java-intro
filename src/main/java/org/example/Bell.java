package org.example;

public class Bell {
    private boolean ring = false;

    public void sound() {
        if(ring) {
            System.out.println("dong");
        } else {
            System.out.println("ding");
        }

        ring = !ring;
    }
}
