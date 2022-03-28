package Item.Equipment.Weapon;

import Item.Equipment.Weapon.Stat.Attack;
import Item.Equipment.Weapon.Stat.Protection;
import Item.Equipment.Weapon.Stat.WeaponStat;

public class Arrow extends Weapon {

    public Arrow() {
        super(5);
    }

    @Override
    public int modifier(WeaponStat weaponStat) {
        if (weaponStat instanceof Attack) {
            return 3;
        } else if (weaponStat instanceof Protection) {
            return 0;
        }
        return 3;
    }
}
