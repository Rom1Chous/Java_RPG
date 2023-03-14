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
        System.out.println("Vous etes tranquillement dans votre maison de vacances avec vos Parents dans le Sud de l'Angleterre. Il fait nuit et vous vous apprétiez à dormir quand soudain vous entendez un grand bruit sourd assez inconnu. \n" +
                "Vous vous décidez à sortir et vous arrivez nez à nez avec un un homme énorme avec un accoutrement que vous reconnaissez. C'est un soricer ! Vous n'en croyez pas vos car vous n'en aviez jamais vu un de votre vie meme si votre Père qui jadis fut un sorcier vous avais tout raconté à leur propos. L'hommme vous regarde et dit : " +
                "\"Bonjour, je suis Rubeus Hagrid gardien des clés et des lieux à Poudlard\", dit-il en souriant. \"Je viens chercher un jeune sorcier de 11ans pour l'emmener à Poudlard.\n Et vous êtes...?");
        String name = scanner.nextLine();
        System.out.println("Hagrid sourit à votre réponse, puis reprend : \"Très bien, " + name + ". Avant de partir pour Poudlard, il y a quelques petites choses que vous devez faire .\n" +
                "Tout d'abord, il vous faudra une baguette mais aussi un animal qui vous suivra pendant toute votre scolarité à Poudlard. Suivez-moi !");
        System.out.println("En deux temps trois mouvements Hagrid vous emmène à Londres à l'arrière d'un bar et vous fait découvrir un lieu magique nommé le chemin de traverse __\n");
        Core core = Core.values()[random.nextInt(Core.values().length)];
        System.out.println("Vous passez chez Olivander pour acheter votre baguette. Il se met à chercher la baguette avec qui vous corresponderiez le mieux,\nil vous tend alors une baguette de longueur "+ Wand.randomSize() + " faites en "+ Wand.randomWood() +" avec un coeur de " + core );
        System.out.println("Vous sentez la puissance de la baguette vous envahir en un instant. \n");
        System.out.println("Mr Olivander avait vu juste, c'est la baguette parfaite pour vous. \n");
        System.out.println("Vous sortez de la boutique et Hagrid vous accompagne choisir un anilmal.");
        System.out.println("Vous entrez dans l'animalerie du Sorcier et vous voyez 5 type d'animal ");
        System.out.println("Hagrid vous demande alors comment vous allez l'appeler et lequel vous allez chosir! ");
        String nameAnimal = scanner.nextLine();
        System.out.println("Dites bonjour à " + nameAnimal + " votre " + Pet.petChoose() + " !");
        System.out.println(" /n Hagrid vous amène alors à la gare de Londres en vous donnant votre billet pour Poudlard voie 9_3/4 __");
    }

}
