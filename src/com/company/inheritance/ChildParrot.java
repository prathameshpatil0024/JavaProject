package com.company.inheritance;

public class ChildParrot extends Parrot {
    public void beak() {
        System.out.println("small beak");
    }

    public static void main(String[] args) {
        ChildParrot c = new ChildParrot();
        c.beak();
        c.flying();
        c.colour();
        c.eating();
    }
}
