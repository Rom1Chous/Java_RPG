package org.example;

import java.util.Random;
import java.util.Scanner;

public enum Pet {
    Chouette,
    Chat,
    Rat,
    Crapaud,
    Serpent,
    Hamster;


    public static void randomCore() {
        Random random = new Random();
        Core[] core = Core.values();
        Core core_random = core[random.nextInt(core.length)];
        System.out.println("Core aléatoire: " + core_random);
    }
}
