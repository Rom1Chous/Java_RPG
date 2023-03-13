package Element;

import java.util.Random;

public enum House {
    Serpentard,
    Gryffondor,
    Poufsouffle,
    Serdaigle;


    public static House randomHouse() {
        Random random = new Random();
        House[] house = House.values();
        House house_random = house[random.nextInt(house.length)];
        System.out.println("Le Choipeaux vous a assigné la maison " + house_random);
        return house_random;
    }
}

