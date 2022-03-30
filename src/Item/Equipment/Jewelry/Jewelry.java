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
            equipment.getJewelries().add(this);
        }
    }

    @Override
    public int weigth() {
        return super.weigth();
    }
}
