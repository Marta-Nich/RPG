package Item.Equipment.Jewelry;

import Inventory.Equipment;
import Item.Item;
import Item.IEquipable;

public abstract class Jewelry extends Item implements IEquipable {
    @Override
    public int protection() {
        return 0;
    }

    @Override
    public int powerAttack() {
        return 0;
    }

    @Override
    public int slotSpace() {
        return 0;
    }

    @Override
    public void equipBy(Equipment equipment) {
        if (equipment.enters(this)) {
        }
    }

    @Override
    public int weigthEquip() {
        return 0;
    }

    @Override
    public int weigthItem() {
        return super.weigthItem();
    }
}
