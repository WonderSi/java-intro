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

    public String result() {
        if ( this.right < this.left) {
            return "L";
        } else if ( this.right > this.left) {
            return "R";
        } else {
            return "=";
        }
    }

}
