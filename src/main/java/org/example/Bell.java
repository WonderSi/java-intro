package org.example;

public class Bell {
    private boolean bell = false;

    public void sound() {
        if(bell) {
            System.out.println("dong");
        } else {
            System.out.println("ding");
        }

        bell = !bell;
    }

}
