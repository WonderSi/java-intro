package org.example;

import org.example.exceptions.IncorrectHeight;
import org.example.exceptions.IncorrectRadius;
import org.example.geometry3d.Cylinder;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    //1
//    @Test
//    public void testInitialClickCount() {
//        Button button = new Button();
//        assertEquals(1, button.click(), "Click count should be 1");
//    }

    //2
//    @Test
//    public void testInitialBalance() {
//        Balance balance = new Balance();
//        assertEquals("=", balance.result(), "Weights should be equal");
//    }
//    @Test
//    public void testRightBalance() {
//        Balance balance = new Balance();
//        balance.addRight(56);
//        balance.addLeft(5);
//        assertEquals("R", balance.result(), "Right should be heavier");
//    }
//    @Test
//    public void testLeftBalance() {
//        Balance balance = new Balance();
//        balance.addRight(15);
//        balance.addLeft(94);
//        assertEquals("L", balance.result(), "Left should be heavier");
//    }

    //3

    //4
    @Test
    public void testAddEvenNumbers() {
        OddEvenSeparator separator = new OddEvenSeparator();
        separator.addNumber(4);
        separator.addNumber(6);

        assertEquals(Arrays.asList(4, 6), separator.getEven(), "The even list should contain 4 and 6");
    }
    @Test
    public void testAddOddNumbers() {
        OddEvenSeparator separator = new OddEvenSeparator();
        separator.addNumber(3);
        separator.addNumber(5);

        assertEquals(Arrays.asList(3, 5), separator.getOdd(), "The odd list should contain 3 and 5");
    }
    @Test
    public void testAddMixedNumbers() {
        OddEvenSeparator separator = new OddEvenSeparator();
        separator.addNumber(2);
        separator.addNumber(1);
        separator.addNumber(4);
        separator.addNumber(3);

        assertEquals(Arrays.asList(2, 4), separator.getEven(), "The even list should contain 2 and 4");
        assertEquals(Arrays.asList(1, 3), separator.getOdd(), "The odd list should contain 1 and 3");
    }

    //5
    @Test
    public void testInitialValuesAreZero() {
        Table table = new Table(3,3);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                assertEquals(0, table.getValue(i,j), "Initial value should be zero");
            }
        }
    }
    @Test
    public void testSetValueAndGetValue() {
        Table table = new Table(3,3);

        table.setValue(1, 2, 5);
        assertEquals(5, table.getValue(1, 2), "Value at (1,2) should be 5");

        table.setValue(0, 0, 10);
        assertEquals(10, table.getValue(0, 0), "Value at (0,0) should be 10");

        table.setValue(2, 2, -3);
        assertEquals(-3, table.getValue(2, 2), "Value at (2,2) should be -3");
    }
    @Test
    public void testRowsAndCols() {
        Table table = new Table(3,5);

        assertEquals(3, table.rows(), "Number of rows should be 3");
        assertEquals(5, table.cols(), "Number of columns should be 5");
    }
    @Test
    public void testToString() {
        Table table = new Table(3,5);

        table.setValue(0, 0, 1);
        table.setValue(1, 1, 2);

        String expectedOutput = """
                1 0 0 0 0\s
                0 2 0 0 0\s
                0 0 0 0 0""";

        assertEquals(expectedOutput.trim(), table.toString().trim(), "toString() output is incorrect");
    }
    @Test
    public void testAverage() {
        Table table = new Table(3,5);

        assertEquals(0.0, table.average(), "Average should be zero");


    }

    //6
    @Test
    public void testCylinderWithValidDimensions() throws IncorrectHeight, IncorrectRadius {
        Cylinder cylinder = new Cylinder(3.0, 5.0);
        assertEquals(141.3716694115407, cylinder.volume());
    }
    @Test
    public void testCylinderWithInvalidRadius() {
        Exception exception = assertThrows(IncorrectRadius.class, () -> {
            new Cylinder(0, 5.0);
        });
        assertEquals("Incorrect Radius. Radius must be greater than zero.", exception.getMessage());
    }
    @Test
    public void testCylinderWithInvalidHeight() {
        Exception exception = assertThrows(IncorrectHeight.class, () -> {
            new Cylinder(3.0, 0);
        });
        assertEquals("Invalid height. Height must be greater than zero.", exception.getMessage());
    }
}