package Item.Equipment.Armor;

import Character.Pj;
import Item.Item;
import Item.IEquipable;

public abstract class Armor extends Item implements IEquipable {

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
    public int weigthItem() {
        return 0;
    }

    @Override
    public int weigthEquip() {
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
}
