package org.example.exceptions;

public class InvalidIncorrectRadius extends Exception {
    public InvalidIncorrectRadius(String message) {
        super(message);
    }
}
//Question: Когда RuntimeException(ошибка программирования), а когла Exception(ошибка ввода-вывода)?