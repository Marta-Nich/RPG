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
    private LinkedList<IEquipable> weapons = new LinkedList<>();

    private LinkedList<IEquipable> jewelries = new LinkedList<>();

    private LinkedList<IEquipable> boots = new LinkedList<>();

    private LinkedList<IEquipable> chestplates = new LinkedList<>();

    private LinkedList<IEquipable> helmets = new LinkedList<>();

    private LinkedList<IEquipable> leggings = new LinkedList<>();
    private Pj pj;

    public Equipment(Pj pj) {
        this.pj = pj;
    }

    public boolean enters(IEquipable eqipable) {
        if (isWeapon(eqipable)) {
            return eqipable.slotSpace() + weapons.size() <= 2;
        }
        if (isJewelries(eqipable)) {
            return eqipable.slotSpace() + jewelries.size() <= 1;
        }
        if (isBoots(eqipable)) {
            return eqipable.slotSpace() + boots.size() <= 1;
        }
        if (isChestplates(eqipable)) {
            return eqipable.slotSpace() + chestplates.size() <= 1;
        }
        if (isHelmet(eqipable)) {
            return eqipable.slotSpace() + helmets.size() <= 1;
        }
        if (isLeggins(eqipable)) {
            return eqipable.slotSpace() + leggings.size() <= 1;
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
        if (noNullWeapons()) {
            for (IEquipable pickable : weapons) {
                bonusAttack += pickable.powerAttack();
            }
        }
        if (noNullJewelries()) {
            for (IEquipable pickable : jewelries) {
                bonusAttack += pickable.powerAttack();
            }
        }
        if (noNullBoots()) {
            for (IEquipable pickable : boots) {
                bonusAttack += pickable.powerAttack();
            }
        }
        if (noNullChestplates()) {
            for (IEquipable pickable : chestplates) {
                bonusAttack += pickable.powerAttack();
            }
        }
        if (noNullHelmets()) {
            for (IEquipable pickable : helmets) {
                bonusAttack += pickable.powerAttack();
            }
        }
        if (noNullLeggins()) {
            for (IEquipable pickable : leggings) {
                bonusAttack += pickable.powerAttack();
            }
        }
        return bonusAttack * 2;
    }

    private boolean noNullLeggins() {
        return leggings != null;
    }

    private boolean noNullHelmets() {
        return helmets != null;
    }

    private boolean noNullChestplates() {
        return chestplates != null;
    }

    private boolean noNullBoots() {
        return boots != null;
    }

    private boolean noNullJewelries() {
        return jewelries != null;
    }

    private boolean noNullWeapons() {
        return weapons != null;
    }

    public double totalBonusWeigth() {
        double bonusWeigth = 0;
        if (noNullWeapons()) {
            for (IEquipable pickable : weapons) {
                bonusWeigth += pickable.weigthEquip();
            }
        }
        if (noNullJewelries()) {
            for (IEquipable pickable : jewelries) {
                bonusWeigth += pickable.weigthEquip();
            }
        }
        if (noNullBoots()) {
            for (IEquipable pickable : boots) {
                bonusWeigth += pickable.weigthEquip();
            }
        }
        if (noNullChestplates()) {
            for (IEquipable pickable : chestplates) {
                bonusWeigth += pickable.weigthEquip();
            }
        }
        if (noNullHelmets()) {
            for (IEquipable pickable : helmets) {
                bonusWeigth += pickable.weigthEquip();
            }
        }
        if (noNullLeggins()) {
            for (IEquipable pickable : leggings) {
                bonusWeigth += pickable.weigthEquip();
            }
        }
        return bonusWeigth * 2;
    }

    public double totalBonusProtection() {
        double bonusProtection = 0;
        if (noNullWeapons()) {
            for (IEquipable pickable : weapons) {
                bonusProtection += pickable.protection();
            }
        }
        if (noNullJewelries()) {
            for (IEquipable pickable : jewelries) {
                bonusProtection += pickable.protection();
            }
        }
        if (noNullBoots()) {
            for (IEquipable pickable : boots) {
                bonusProtection += pickable.protection();
            }
        }
        if (noNullChestplates()) {
            for (IEquipable pickable : chestplates) {
                bonusProtection += pickable.protection();
            }
        }
        if (noNullHelmets()) {
            for (IEquipable pickable : helmets) {
                bonusProtection += pickable.protection();
            }
        }
        if (noNullLeggins()) {
            for (IEquipable pickable : leggings) {
                bonusProtection += pickable.protection();
            }
        }
        return bonusProtection * 2;
    }

    public void equipIEquipable(IEquipable eqipable) {
        if (enters(eqipable)) {
            if (isWeapon(eqipable)) {
                weapons.add(eqipable);
            }
            if (isJewelries(eqipable)) {
                jewelries.add(eqipable);
            }
            if (isBoots(eqipable)) {
                boots.add(eqipable);
            }
            if (isChestplates(eqipable)) {
                chestplates.add(eqipable);
            }
            if (isHelmet(eqipable)) {
                helmets.add(eqipable);
            }
            if (isLeggins(eqipable)) {
                leggings.add(eqipable);
            }
        }
    }

    public void unEquipIEquipable(IEquipable eqipable) {
        if (noNullWeapons()) {
            if (isWeapon(eqipable)) {
                weapons.remove(eqipable);
            }
        }
        if (noNullJewelries()) {
            if (isJewelries(eqipable)) {
                jewelries.remove(eqipable);
            }
        }
        if (noNullBoots()) {
            if (isBoots(eqipable)) {
                boots.remove(eqipable);
            }
        }
        if (noNullChestplates()) {
            if (isChestplates(eqipable)) {
                chestplates.remove(eqipable);
            }
        }
        if (noNullHelmets()) {
            if (isHelmet(eqipable)) {
                helmets.remove(eqipable);
            }
        }
        if (noNullLeggins()) {
            if (isLeggins(eqipable)) {
                leggings.remove(eqipable);
            }
        }
    }
}
