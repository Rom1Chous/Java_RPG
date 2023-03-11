package com.isep.hpah.core;

import lombok.Getter;
import lombok.Setter;

import java.util.Random ;



public class Wand {
    // attributs
@Getter@Setter Core core;
@Getter@Setter String nom;


    // constructeur
    public Wand(String nom, Core core) {
        this.nom = nom;
        this.core = core;

    }

    public enum Wood {
        Bois_de_vigne,
        Bois_de_chêne,
        Bois_de_saule,
        Bois_de_hêtre,
        Bois_de_châtaignier;
    }
    public static Wood randomWood() {
        Random random = new Random();
        Wood[] wood = Wood.values();
        Wood wood_random = wood[random.nextInt(wood.length)];
        System.out.println("Bois de la baguette est" +" "+ wood_random);
        return wood_random;
    }
    public static int randomSize() {
            Random random = new Random();
            int size_random = random.nextInt(21) + 10;
            System.out.println("la baguette mesure "+size_random+"cm");
            return size_random;
        }
    }