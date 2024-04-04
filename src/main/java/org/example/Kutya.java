package org.example;

public class Kutya extends Emlős {
    private int a = 5;
    @Override
    public void speak(int speakCount) {
        for (int i = 0; i < speakCount; i++) {
            System.out.println("Vau vau");
        }
    }

    @Override
    public void move() {
        System.out.println("Szalad");
    }
    public void wagTail() {
        System.out.println("Csóvál csóvál");
    }


}
