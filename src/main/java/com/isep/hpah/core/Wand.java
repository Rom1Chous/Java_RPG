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
    public static void randomWood() {
        Random random = new Random();
        Wood[] wood = Wood.values();
        Wood wood_random = wood[random.nextInt(wood.length)];
        System.out.println("Bois de la baguette est" + wood_random);
    }

}