package com.isep.hpah.core;
import java.util.Scanner;

public class Main {

        enum Objets {
            OBJET1,
            OBJET2,
            OBJET3
        }

        public static void main (String[]args){

            Scanner scanner = new Scanner(System.in);

            System.out.println("Veuillez sélectionner un objet :");

            Objets objetSelectionne = null;
            while (objetSelectionne == null) {
                String choix = scanner.nextLine();
                try {
                    objetSelectionne = Objets.valueOf(choix.toUpperCase());
                } catch (IllegalArgumentException e) {
                    System.out.println("Veuillez saisir une option valide.");
                }
            }

            System.out.println("Vous avez sélectionné l'objet " + objetSelectionne);

        }
    }