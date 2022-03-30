package Item.Equipment.Weapon;

import Inventory.Equipment;
import Item.Item;
import Item.IEquipable;

public abstract class Weapon extends Item implements IEquipable {
    private double speed = 0;

    public double getSpeed() {
        return speed;
    }

    public double totalAttackBonus() {
        return 0;
    }

    @Override
    public int weigth() {
        return 0;
    }

    @Override
    public int powerAttack() {
        return 0;
    }

    @Override
    public int protection() {
        return 0;
    }

    @Override
    public int slotSpace() {
        return 0;
    }

    @Override
    public void equipBy(Equipment equipment) {
        if (equipment.enters(this)) {
            equipment.getWeapons().add(this);
        }
    }

    @Override
    public String toString() {
        return "Weapon{" + getClass().getSimpleName() +
                " bonus speed = " + getSpeed() +
                " bonus  attack = " + powerAttack() +
                " bonus protection = " + protection() +
                " }";
    }
}
