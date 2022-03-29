package Item.Equipment.Weapon;

import Item.Item;
import Item.IEquipable;

public abstract class Weapon extends Item implements IEquipable {
    private double speed = 0;

    public double getSpeed() {
        return speed;
    }

    public double bonusAttack() {
        return 0;
    }

    public double nerfWeigth() {
        return 0;
    }

    public double bonusSpeed() {
        return 0;
    }

    public double bonusProtection() {
        return 0;
    }

    public double totalBonus() {
        return 0;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "speed=" + speed +
                '}';
    }
}
