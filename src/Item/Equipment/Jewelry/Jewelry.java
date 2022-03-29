package Item.Equipment.Jewelry;

import Item.Item;
import Item.IEquipable;

public abstract class Jewelry extends Item implements IEquipable {
    public double bonusAttack() {
        return 0;
    }

    public double nerfWeigth() {
        return 0;
    }
    public double bonusProtection() {
        return 0;
    }

    public double totalBonus() {
        return 0;
    }

    public Jewelry() {
    }
}
