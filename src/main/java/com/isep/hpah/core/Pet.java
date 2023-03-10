package com.isep.hpah.core;

import java.util.Random;

public enum Pet {
    Chouette,
    Chat,
    Rat,
    Crapaud,
    Serpent,
    Hamster;


    public static void randomPet() {
        Random random = new Random();
        Core[] pet = Core.values();
        Core pet_random = pet[random.nextInt(pet.length)];
        System.out.println("Core aléatoire: " + pet_random);
    }
}
