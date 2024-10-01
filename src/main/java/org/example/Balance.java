package org.example;

public class Balance {
    private int right = 0;
    private int left = 0;

    public void addRight( int weight) {
        this.right = weight;
    }

    public void addLeft( int weight) {
        this.left = weight;
    }

    public void result() {
        if ( this.right < this.left) {
            System.out.println("L");
        } else if ( this.right > this.left) {
            System.out.println("R");
        } else {
            System.out.println("=");
        }
    }
}
