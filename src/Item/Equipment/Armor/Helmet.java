package Item.Equipment.Armor;

import Inventory.Equipment;

public class Helmet extends Armor {
    private int powerAttack = 3;
    private int weigth = 4;
    private int protection = 5;
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
