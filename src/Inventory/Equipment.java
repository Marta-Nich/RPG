package Inventory;

import Item.Equipment.Armor.Boots;
import Item.Equipment.Armor.Chestplate;
import Item.Equipment.Armor.Helmet;
import Item.Equipment.Armor.Leggings;
import Item.Equipment.Jewelry.Jewelry;
import Item.Equipment.Weapon.Weapon;
import Item.IEquipable;

import java.util.LinkedList;

public class Equipment {
    private LinkedList<IEquipable> weapons = new LinkedList<>();

    private LinkedList<IEquipable> jewelries = new LinkedList<>();

    private LinkedList<IEquipable> boots = new LinkedList<>();

    private LinkedList<IEquipable> chestplates = new LinkedList<>();

    private LinkedList<IEquipable> helmets = new LinkedList<>();

    private LinkedList<IEquipable> leggings = new LinkedList<>();

    public boolean enters(IEquipable eqipable) {
        if (isWeapon(eqipable)) {
            if (eqipable.slotSpace() + weapons.size() <= 2) {
                return true;
            }
        }
        if (isJewelries(eqipable)) {
            if (eqipable.slotSpace() + jewelries.size() <= 1) {
                return true;
            }
        }
        if (isBoots(eqipable)) {
            if (eqipable.slotSpace() + boots.size() <= 1) {
                return true;
            }
        }
        if (isChestplates(eqipable)) {
            if (eqipable.slotSpace() + chestplates.size() <= 1) {
                return true;
            }
        }
        if (isHelmet(eqipable)) {
            if (eqipable.slotSpace() + helmets.size() <= 1) {
                return true;
            }
        }
        if (isLeggins(eqipable)) {
            if (eqipable.slotSpace() + leggings.size() <= 1) {
                return true;
            }
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
        if (weapons != null) {
            for (IEquipable pickable : weapons) {
                bonusAttack += pickable.powerAttack();
            }
        }
        if (jewelries != null) {
            for (IEquipable pickable : jewelries) {
                bonusAttack += pickable.powerAttack();
            }
        }
        if (boots != null) {
            for (IEquipable pickable : boots) {
                bonusAttack += pickable.powerAttack();
            }
        }
        if (chestplates != null) {
            for (IEquipable pickable : chestplates) {
                bonusAttack += pickable.powerAttack();
            }
        }
        if (helmets != null) {
            for (IEquipable pickable : helmets) {
                bonusAttack += pickable.powerAttack();
            }
        }
        if (leggings != null) {
            for (IEquipable pickable : leggings) {
                bonusAttack += pickable.powerAttack();
            }
        }
        return bonusAttack;
    }

    public double totalBonusWeigth() {
        double bonusWeigth = 0;
        if (weapons != null) {
            for (IEquipable pickable : weapons) {
                bonusWeigth += pickable.weigthEquip();
            }
        }
        if (jewelries != null) {
            for (IEquipable pickable : jewelries) {
                bonusWeigth += pickable.weigthEquip();
            }
        }
        if (boots != null) {
            for (IEquipable pickable : boots) {
                bonusWeigth += pickable.weigthEquip();
            }
        }
        if (chestplates != null) {
            for (IEquipable pickable : chestplates) {
                bonusWeigth += pickable.weigthEquip();
            }
        }
        if (helmets != null) {
            for (IEquipable pickable : helmets) {
                bonusWeigth += pickable.weigthEquip();
            }
        }
        if (leggings != null) {
            for (IEquipable pickable : leggings) {
                bonusWeigth += pickable.weigthEquip();
            }
        }
        return bonusWeigth;
    }

    public double totalBonusProtection() {
        double bonusProtection = 0;
        if (weapons != null) {
            for (IEquipable pickable : weapons) {
                bonusProtection += pickable.protection();
            }
        }
        if (jewelries != null) {
            for (IEquipable pickable : jewelries) {
                bonusProtection += pickable.protection();
            }
        }
        if (boots != null) {
            for (IEquipable pickable : boots) {
                bonusProtection += pickable.protection();
            }
        }
        if (chestplates != null) {
            for (IEquipable pickable : chestplates) {
                bonusProtection += pickable.protection();
            }
        }
        if (helmets != null) {
            for (IEquipable pickable : helmets) {
                bonusProtection += pickable.protection();
            }
        }
        if (leggings != null) {
            for (IEquipable pickable : leggings) {
                bonusProtection += pickable.protection();
            }
        }
        return bonusProtection;
    }

    public void equipIEquipable(IEquipable eqipable) {
        eqipable.equipBy(this);
    }
}
