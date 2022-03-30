package Item.Equipment.Armor;

import Inventory.Equipment;

public class Leggings extends Armor {
    private int powerAttack = 4;
    private int weigth = 6;
    private int protection = 6;
    private int slotSpace = 1;

    @Override
    public int powerAttack() {
        return powerAttack;
    }

    @Override
    public int protection() {
        return protection;
    }

    @Override
    public int weigthItem() {
        return weigth;
    }

    @Override
    public int weigthEquip() {
        return weigth;
    }

    @Override
    public int slotSpace() {
        return slotSpace;
    }

    @Override
    public void equipBy(Equipment equipment) {
        if (equipment.enters(this)) {
        }
    }
}
