package Item.Equipment.Armor;

import Item.Item;
import Item.IEquipable;

public abstract class Armor extends Item implements IEquipable {
    public Armor() {
    }

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
        return super.slotSpace();
    }

    @Override
    public int weigth() {
        return super.weigth();
    }
}
