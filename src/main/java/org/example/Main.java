package org.example;


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
    }
}