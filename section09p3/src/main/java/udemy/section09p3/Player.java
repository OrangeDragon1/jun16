package udemy.section09p3;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public void read(List<String> values) {
        if ((values != null) && (values.size() > 0)) {
            this.name = values.get(0);
            this.hitPoints = Integer.parseInt(values.get(1));
            this.strength = Integer.parseInt(values.get(2));
            this.weapon = values.get(3);
        }
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<>();
        values.add(0, this.name);
        values.add(1, Integer.toString(this.hitPoints));
        values.add(2, Integer.toString(this.strength));
        values.add(3, this.weapon);
        return values;
    }

    @Override
    public String toString() {
        return String.format("Player{name='%s', hitPoints=%d, strength=%d, weapon='%s'}", this.name, this.hitPoints,
                this.strength, this.weapon);
    }

}
