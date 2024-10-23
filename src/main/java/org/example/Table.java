package org.example;

public class Table {
    private int[][] data;
    private int rows;
    private int cols;

    public Table(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        this.data = new int[rows][cols];
    }

    public int getValue(int row, int col) {
        return data[row][col];
    }

    public void setValue(int row, int col, int value) {
        data[row][col] = value;
    }

    public int rows() {
        return rows;
    }

    public int cols() {
        return cols;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        for(int[] row: data) {
            for(int value : row) {
                sb.append(value).append(" ");
            }
            sb.append("\n");
        }

        return sb.toString();
    }

    public double average() {
        int sum = 0;
        int count = 0;

        for(int[] row: data) {
            for(int value : row) {
                sum += value;
                count++;
            }
        }

        return count > 0 ? (double) sum / count : 0;
    }

    public void showTable() {
        System.out.println("Table:");
        System.out.println(this);
    }

    public void showAverage() {
        System.out.println("Среднее арифметическое: " + average());
    }

}
