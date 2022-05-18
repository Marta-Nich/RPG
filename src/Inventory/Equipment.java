package Inventory;

import Item.Equipment.Armor.Boots;
import Item.Equipment.Armor.Chestplate;
import Item.Equipment.Armor.Helmet;
import Item.Equipment.Armor.Leggings;
import Item.Equipment.Jewelry.Jewelry;
import Item.Equipment.Weapon.Weapon;
import Item.IEquipable;
import Character.Pj;

import java.util.LinkedList;

public class Equipment {
    private LinkedList<IEquipable> equipables = new LinkedList<>();

    private Pj pj;

    public Equipment(Pj pj) {
        this.pj = pj;
    }

    public boolean enters(IEquipable eqipable) {
        if (isWeapon(eqipable)) {
            return eqipable.slotSpace() + equipables.size() <= 2;
        }
        if (isJewelries(eqipable)) {
            return eqipable.slotSpace() + equipables.size() <= 2;
        }
        if (isBoots(eqipable)) {
            return eqipable.slotSpace() + equipables.size() <= 1;
        }
        if (isChestplates(eqipable)) {
            return eqipable.slotSpace() + equipables.size() <= 1;
        }
        if (isHelmet(eqipable)) {
            return eqipable.slotSpace() + equipables.size() <= 1;
        }
        if (isLeggins(eqipable)) {
            return eqipable.slotSpace() + equipables.size() <= 1;
        }
        return false;
    }

    private boolean isLeggins(IEquipable eqipable) {
        return eqipable instanceof Leggings;
    }

    private boolean isHelmet(IEquipable eqipable) {
        return eqipable instanceof Helmet;
    }

    private boolean isChestplates(IEquipable eqipable) {
        return eqipable instanceof Chestplate;
    }

    private boolean isBoots(IEquipable eqipable) {
        return eqipable instanceof Boots;
    }

    private boolean isJewelries(IEquipable eqipable) {
        return eqipable instanceof Jewelry;
    }

    private boolean isWeapon(IEquipable eqipable) {
        return eqipable instanceof Weapon;
    }

    public double totalBonusAttack() {
        double bonusAttack = 0;
        if (equipables != null) {
            for (IEquipable pickable : equipables) {
                bonusAttack += pickable.powerAttack();
            }
        }
        return bonusAttack * 2;
    }

    public double totalBonusWeigth() {
        double bonusWeigth = 0;
        if (equipables != null) {
            for (IEquipable pickable : equipables) {
                bonusWeigth += pickable.weigthEquip();
            }
        }
        return bonusWeigth * 2;
    }

    public double totalBonusProtection() {
        double bonusProtection = 0;
        if (equipables != null) {
            for (IEquipable pickable : equipables) {
                bonusProtection += pickable.protection();
            }
        }
        return bonusProtection * 2;
    }

    public void equipIEquipable(IEquipable eqipable) {
        if (enters(eqipable)) {
            equipables.add(eqipable);
        }
    }

    public void unEquipIEquipable(IEquipable eqipable) {
        if (equipables != null) {
            equipables.remove(eqipable);
        }
    }
}
