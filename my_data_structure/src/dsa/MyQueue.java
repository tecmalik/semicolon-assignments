package dsa;

import javax.swing.*;

public class MyQueue {
    private String[] elements = new String[4];
    private int size = 0 ;
    private int number = 0;

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(String element) {
        this.elements[size] = element;
        this.size++;
    }
    public int size() {
    return this.size;
    }

    public void offer(String element ){
        this.elements[size] = element;
        this.size++;
    }

    public String get(int index) {
        return this.elements[index];
    }

    public void remove() {
        this.elements[size-(size-number)] = null;
        this.size--;
        this.number++;
    }

    public String peek() {
        return this.elements[0];
    }

    public String pool() {
        return this.elements[0];
    }
}
