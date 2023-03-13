package Game;
import Element.*;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;


public class Game {
    public static void main(String[] args) {
        start();
    }

    public static void start() {


        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Vous entendez frapper à la porte. En l'ouvrant, vous trouvez un homme gigantesque, un demi-géant, avec une barbe sauvage et des yeux pétillants.\n" +
                "\"Bonjour, je suis Rubeus Hagrid gardien des clés et des lieux à Poudlard\", dit-il en souriant. \"Je viens chercher un jeune sorcier de 11ans pour l'emmener à Poudlard.\n Et vous êtes...?");
        String name = scanner.nextLine();
        System.out.println("Hagrid sourit à votre réponse, puis reprend : \"Très bien, " + name + ". Avant de partir pour Poudlard, il y a quelques formalités à régler.\n" +
                "Tout d'abord, il vous faut  vos fournitures un chaudron standard en étain, un animal de compagnie et une baguette. Suivez-moi !");
        System.out.println("\n\t __ Hagrid vous emmène à Londres à l'arrière d'un bar et vous fait découvrir un lieu magique nommé le chemin de traverse __\n");
        Core core1 = Core.values()[random.nextInt(Core.values().length)];
        System.out.println("Vous passez chez Olivander acheter votre baguette. Il se met à chercher la baguette avec qui vous corresponderiez la mieux,\nil vous tend alors une baguette faite avec un coeur d'" + core1 + " et vous demande de faire le geste");
        System.out.println("Vous sentez la puissance de la baguette vous envahire en un instant. \n");
        System.out.println("Mr Olivander avait vu juste, c'est la baguette parfaite pour vous. \n");
        System.out.println("Vous sortez de la boutique et Hagrid vous accompagne choisir un anilmal.");
        System.out.println("Vous entrez dans l'animalerie du Sorcier et vous voyez 5 type d'animal ");
        petChoose();
        System.out.println("Hagrid vous demande alors comment vous allez l'appeler :");
        String nameAnimal = scanner.nextLine();
        System.out.println("Dites bonjour à " + nameAnimal + " votre " +  + " !");
        System.out.println("\n\t __ Hagrid vous amène alors à la gare de Londres en vous donnant votre billet pour Poudlard voie 9_3/4 __");
    }
    public static int petChoose() {
        int choix = 0;
        while (choix < 1 || choix > Pet.values().length) {
            System.out.println("Choisissez un animal : ");
            for (Pet pet : Pet.values()) {
                System.out.println(pet.index + " : " + pet.type);
            }
            Scanner scanner = new Scanner(System.in);
            try {
                choix = scanner.nextInt();
                scanner.nextLine();
                if (choix < 1 || choix > Pet.values().length) {
                    System.out.println("Le choix doit être un nombre entre 1 et " + Pet.values().length + ".");
                }
            } catch (InputMismatchException e) {
                System.out.println("Le choix doit être un nombre.");
                scanner.nextLine();
            }
        }
        return choix;
    }
}
