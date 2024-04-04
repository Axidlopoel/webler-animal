package org.example;

public abstract class Madár extends Állat {

    public Madár() {
        super.setLegCount(2);
    }
    public void fly() {
        System.out.println("Repül");
    }
}
