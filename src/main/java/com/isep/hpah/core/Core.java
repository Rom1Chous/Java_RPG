package com.isep.hpah.core;

import java.util.Random;

public enum Core {
    Phoenix_Feather,
    Dragon_Hearstring,
    Unicorn_Tail_Hair,
    Veela_Hair,
    Basilica_Tooth;

    public static void randomCore() {
        Random random = new Random();
        Core[] core = Core.values();
        Core core_random = core[random.nextInt(core.length)];
        System.out.println("Core aléatoire: " + core_random);
    }
}


