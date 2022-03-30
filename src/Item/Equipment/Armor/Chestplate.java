package Item.Equipment.Armor;

import Inventory.Equipment;

public class Chestplate extends Armor {
    private int powerAttack = 5;
    private int weigth = 7;
    private int protection = 7;
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
}
