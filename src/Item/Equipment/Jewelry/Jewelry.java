package Item.Equipment.Jewelry;

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

    public Jewelry() {
    }

    @Override
    public int slotSpace() {
        return super.slotSpace();
    }

    @Override
    public int weigth() {
        return super.weigth();
    }
}
