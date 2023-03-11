package com.isep.hpah.core;
import java.util.Scanner;

import static com.isep.hpah.core.Core.randomCore;
import static com.isep.hpah.core.House.randomHouse;
import static com.isep.hpah.core.Pet.PetChoose;
import static com.isep.hpah.core.Wand.randomSize;
import static com.isep.hpah.core.Wand.randomWood;

public class Main {

        public static void main (String[]args){
        PetChoose();
        randomWood();
        randomCore();
        randomSize();
        randomHouse();


        }

}