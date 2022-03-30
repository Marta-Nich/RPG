package Inventory;

import Item.Equipment.Armor.*;
import Item.Equipment.Jewelry.Jewelry;
import Item.Equipment.Weapon.Weapon;
import Item.IEquipable;

import java.util.LinkedList;

public class Equipment {
    private LinkedList<IEquipable> equip;

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

    public void equipIEquipable(IEquipable eqipable) {
        eqipable.equipBy(this);
    }
}
