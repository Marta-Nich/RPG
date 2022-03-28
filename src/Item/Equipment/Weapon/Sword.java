package Item.Equipment.Weapon;

import Character.Stat.Strength;
import Item.Equipment.Weapon.Stat.Attack;
import Item.Equipment.Weapon.Stat.Protection;
import Item.Equipment.Weapon.Stat.WeaponStat;
import Item.Stat.ItemStat;
import Item.Stat.Weigth;

public class Sword extends Weapon {

    @Override
    public int modifier(WeaponStat weaponStat) {
        if (weaponStat instanceof Attack) {
            return 3;
        } else if (weaponStat instanceof Protection) {
            return 3;
        }
        return 4;
    }

    @Override
    public int modifier(ItemStat itemStat) {
        if (itemStat instanceof Weigth) {
            return 6;
        }
        return 0;
    }
}
