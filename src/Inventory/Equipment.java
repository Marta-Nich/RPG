package Inventory;

import Item.Equipment.Armor.*;
import Item.Equipment.Jewelry.Jewelry;
import Item.Equipment.Weapon.Weapon;
import Item.IEquipable;
import Item.IPickable;

import java.util.LinkedList;

public class Equipment {
    private LinkedList<IEquipable> weapons;

    public LinkedList<IEquipable> getWeapons() {
        return weapons;
    }

    private LinkedList<IEquipable> jewelries;

    public LinkedList<IEquipable> getJewelries() {
        return jewelries;
    }

    private LinkedList<IEquipable> boots;

    public LinkedList<IEquipable> getBoots() {
        return boots;
    }

    private LinkedList<IEquipable> chestplates;

    public LinkedList<IEquipable> getChestplates() {
        return chestplates;
    }

    private LinkedList<IEquipable> helmets;

    public LinkedList<IEquipable> getHelmets() {
        return helmets;
    }

    private LinkedList<IEquipable> leggings;

    public LinkedList<IEquipable> getLeggings() {
        return leggings;
    }

    public boolean enters(IEquipable eqipable) {
        if (eqipable instanceof Weapon) {
            if (eqipable.slotSpace() + weapons.size() <= 2) {
                return true;
            }
        }
        if (eqipable instanceof Jewelry) {
            if (eqipable.slotSpace() + jewelries.size() <= 1) {
                return true;
            }
        }
        if (eqipable instanceof Boots) {
            if (eqipable.slotSpace() + boots.size() <= 1) {
                return true;
            }
        }
        if (eqipable instanceof Chestplate) {
            if (eqipable.slotSpace() + chestplates.size() <= 1) {
                return true;
            }
        }
        if (eqipable instanceof Helmet) {
            if (eqipable.slotSpace() + helmets.size() <= 1) {
                return true;
            }
        }
        if (eqipable instanceof Leggings) {
            if (eqipable.slotSpace() + leggings.size() <= 1) {
                return true;
            }
        }
        return false;
    }

    public double totalBonusAttack() {
        double bonusAttack = 0;
        for (IEquipable pickable : weapons) {
            bonusAttack += pickable.powerAttack();
        }
        for (IEquipable pickable : jewelries) {
            bonusAttack += pickable.powerAttack();
        }
        for (IEquipable pickable : boots) {
            bonusAttack += pickable.powerAttack();
        }
        for (IEquipable pickable : chestplates) {
            bonusAttack += pickable.powerAttack();
        }
        for (IEquipable pickable : helmets) {
            bonusAttack += pickable.powerAttack();
        }
        for (IEquipable pickable : leggings) {
            bonusAttack += pickable.powerAttack();
        }
        return bonusAttack;
    }

    public double totalBonusWeigth() {
        double bonusWeigth = 0;

        return bonusWeigth;
    }

    public double totalBonusProtection() {
        double bonusProtection = 0;
        for (IEquipable pickable : weapons) {
            bonusProtection += pickable.protection();
        }
        for (IEquipable pickable : jewelries) {
            bonusProtection += pickable.protection();
        }
        for (IEquipable pickable : boots) {
            bonusProtection += pickable.protection();
        }
        for (IEquipable pickable : chestplates) {
            bonusProtection += pickable.protection();
        }
        for (IEquipable pickable : helmets) {
            bonusProtection += pickable.protection();
        }
        for (IEquipable pickable : leggings) {
            bonusProtection += pickable.protection();
        }
        return bonusProtection;
    }

    public void equipIEquipable(IEquipable eqipable) {
        eqipable.equipBy(this);
    }
}
