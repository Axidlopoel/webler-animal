package org.example;

public class Varjú extends Madár{
    @Override
    public void move() {
        System.out.println("sétál");
    }

    @Override
    public void speak(int speakCount) {
        for (int i = 0; i < speakCount; i++) {
            System.out.println("Kár kár");
        }
    }
}
