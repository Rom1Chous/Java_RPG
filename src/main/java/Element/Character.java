package Element;

import lombok.Getter;
import lombok.Setter;

public abstract class Character {

    @Getter@Setter private int health;
    @Getter@Setter private final int maxHealth;
    @Getter@Setter private final String name;
    @Getter@Setter private int accuracy;
    @Getter@Setter private int damage;
    @Getter@Setter private int defense;



    public Character(int lifePoint, int maxLifePoint, String name, int accuracy, int power, int efficiencyPotions, int resistance) {
        this.health = lifePoint;
        this.maxHealth = maxLifePoint;
        this.name = name;
        this.accuracy = accuracy;
        this.damage = power;
        this.defense = resistance;
    }

    public int getLifePoint() {
        return health;
    }

    public void setLifePoint(int lifePoint) {
        this.health = lifePoint;
    }


    public int getPower() {
        return damage;
    }

    public void setPower(int power) {
        this.damage = power;
    }
}