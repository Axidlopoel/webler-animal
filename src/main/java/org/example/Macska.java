package org.example;

public class Macska extends Emlős {

    @Override
    public void speak(int speakCount) {
        for (int i = 0; i < speakCount; i++) {
            System.out.println("Miau miau");
        }
    }

    @Override
    public void move() {
        System.out.println("Lépeget");
    }

    public void purr() {
        System.out.println("Purr purr");
    }
}
