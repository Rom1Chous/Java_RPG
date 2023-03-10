package org.example;

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



}

/* liste des coeur de baguette dans Harry Potter

1. Bois de vigne
2. Bois de chêne
3. Bois de saule
4. Bois de hêtre
5. Bois de châtaignier
6. Bois de frêne
7. Bois de platane
8. Bois d'acacia
9. Bois de noisetier
10. Bois de sorbier
*/