package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Szia! Válasz az alábbi állatok közül: ");
        System.out.println("kutya, macska, varjú, rigó");
        Scanner scanner = new Scanner(System.in);
        String animal = scanner.next();
        System.out.println("Hányszor beszéljen?");
        int speakCount = scanner.nextInt();

        if (!animal.equalsIgnoreCase("kutya")
                && !animal.equalsIgnoreCase("macska")
                && !animal.equalsIgnoreCase("varjú")
                && !animal.equalsIgnoreCase("rigó")) {
            System.out.println("Hiba!");
        }

        if (animal.equalsIgnoreCase("kutya")) {
            Kutya csili = new Kutya();
            csili.move();
            csili.speak(speakCount);
            csili.wagTail();
            System.out.println(String.format("Lábszám: %d", csili.getLegCount()));
        }

        if(animal.equalsIgnoreCase("macska")) {
            Macska lois = new Macska();
            lois.purr();
            lois.speak(speakCount);
            lois.move();
            System.out.println(String.format("Lábszám: %d", lois.getLegCount()));
        }

        if(animal.equalsIgnoreCase("varjú")) {
            Varjú varjú = new Varjú();
            varjú.speak(speakCount);
            varjú.move();
            varjú.fly();
            System.out.println(String.format("Lábszám: %d", varjú.getLegCount()));
        }

        if(animal.equalsIgnoreCase("rigó")) {
            Rigó rigó = new Rigó();
            rigó.speak(speakCount);
            rigó.move();
            rigó.fly();
            System.out.println(String.format("Lábszám: %d", rigó.getLegCount()));
        }

    }

}