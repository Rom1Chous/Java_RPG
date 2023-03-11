package com.isep.hpah.core;
import lombok.*;
import java.util.Random;
import java.util.Scanner;
public enum Pet {
    Chouette (1),
    Chat(2),
    Rat(3),
    Crapaud(4),
    Serpent(5),
    Hamster(6);
    private final int value;
    private Pet(int value) {
        this.value = value;
    }
   /* public static void randomPet() {
        Random random = new Random();
        Pet[] pet = Pet.values();
        Pet pet_random = pet[random.nextInt(pet.length)];
        System.out.println("Core aléatoire: " + pet_random);
    }
    */
    // for (Pet pet : Pet.values()) {
    // System.out.println(pet.toString());
    //  }

    public static void PetChoose(){
        Scanner clavier = new Scanner(System.in);
        System.out.println("Choisissez un Pet :");
        System.out.println(" ");
        for (Pet pet : Pet.values()) {
            System.out.println(pet.ordinal() + ". " + pet);
        }
        int choix = clavier.nextInt();
        switch (Pet.values()[choix]) {
            case  Chouette:
                System.out.println("Vous avez choisi une Chouette.");
                break;
            case Chat:
                System.out.println("Vous avez choisi un Chat.");
                break;
            case Rat:
                System.out.println("Vous avez choisi un Rat.");
                break;
            case Crapaud:
                System.out.println("Vous avez choisi un Crapaud.");
                break;
            case Serpent:
                System.out.println("Vous avez choisi un Serpent.");
                break;
            case Hamster:
                System.out.println("Vous avez choisi un Hamster.");
                break;
            default:
                System.out.println("Choix invalide.");
                break;
        }
    }
}
