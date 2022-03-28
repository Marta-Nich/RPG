package Item.Equipment.Weapon;

import Item.Equipment.Weapon.Stat.Attack;
import Item.Equipment.Weapon.Stat.Protection;
import Item.Equipment.Weapon.Stat.WeaponStat;
import Item.Stat.ItemStat;
import Item.Stat.Weigth;

public class Arrow extends Weapon {

    @Override
    public int modifier(WeaponStat weaponStat) {
        if (weaponStat instanceof Attack) {
            return 3;
        } else if (weaponStat instanceof Protection) {
            return 0;
        }
        return 3;
    }

    @Override
    public int modifier(ItemStat itemStat) {
        if (itemStat instanceof Weigth) {
            return 5;
        }
        return 0;
    }
}
