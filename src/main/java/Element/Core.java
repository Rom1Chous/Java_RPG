package Element;

import java.util.Random;

public enum Core {
    DragonHeartstring(1, "Fil de coeur de dragon"),
    PhoenixFeather(2, "Plume de phénix"),
    UnicornTailHair(3, "Poil de queue de licorne"),
    Basiliskhorn (4, "Corne de Basilic"),
    HornedSerpenthorn(5, "Serpent cornu"),
    TrollWhisker(6, "Moustache de troll");

    public final int index;
    public final String type;

    Core(int index, String type) {
        this.index = index;
        this.type = type;
    }
}


