package org.example.tasktwo;

public record Order(int orderId, String shoeType, int quantity) {
}

// По капотом record. Для наглядности
/*
public class Order {
    private final int orderId;
    private final String shoeType;
    private final int quantity;

    public Order(int orderId, String shoeType, int quantity) {
        this.orderId = orderId;
        this.shoeType = shoeType;
        this.quantity = quantity;
    }

    public int orderId() {
        return orderId;
    }

    public String shoeType() {
        return shoeType;
    }

    public int quantity() {
        return quantity;
    }

    @Override
    public String toString() {

    }

    @Override
    public boolean equals(Object o) {

    }

    @Override
    public int hashCode() {

    }
}

*/