package Element;
import java.util.Scanner;
import java.util.InputMismatchException;

public enum Pet {
    Chouette(1, "Chouette"),
    Rat(2, "Rat"),
    Chat(3, "Chat"),
    Crapaud(4, "Crapaud"),
    Serpent(5, "Serpent");

    public final int index;
    public final String type;

    Pet(int index, String type) {
        this.index = index;
        this.type = type;
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