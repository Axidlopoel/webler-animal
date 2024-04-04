package org.example;

public class Rigó extends Madár{
    @Override
    public void move() {
        System.out.println("ugrik");
    }

    @Override
    public void speak(int speakCount) {
        for (int i = 0; i < speakCount; i++) {
            System.out.println("Csip csip");
        }
    }
}
