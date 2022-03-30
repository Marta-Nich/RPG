package Item.Equipment.Weapon;

import Character.Pj;
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
    public int weigthItem() {
        return 0;
    }

    @Override
    public int weigthEquip() {
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
    public void equipBy(Pj pj) {
        pj.putEquipment(this);
    }

    @Override
    public void unEquipBy(Pj pj) {
        pj.removeEquipment(this);
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
