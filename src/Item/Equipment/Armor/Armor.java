package Item.Equipment.Armor;

import Item.Item;
import Item.IEquipable;

public abstract class Armor extends Item implements IEquipable {
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

    public Armor() {
    }
}
