package com.company;

public enum Color {
    WHITE(1), BLACK(2);

    private int value;

    Color() {
    }

    Color(int i) {
        this.value = i;
    }

    //define instance method
    public void printValue() {
        System.out.println(this.value);
    }
}
