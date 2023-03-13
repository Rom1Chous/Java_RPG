package Element;
import java.util.Scanner;
import java.util.InputMismatchException;

public enum Pet {
    Chouette(1, "Chouette"),
    Rat(2,"Rat"),
    Chat(3,"Chat"),
    Crapaud(4,"Crapaud"),
    Serpent(4,"Serpent");

    public final int index;
    public final String type;

    Pet(int index, String type){
        this.index = index;
        this.type = type;
    }
}
