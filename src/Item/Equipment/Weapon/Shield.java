package Item.Equipment.Weapon;

import Item.Equipment.Weapon.Stat.Attack;
import Item.Equipment.Weapon.Stat.Protection;
import Item.Equipment.Weapon.Stat.WeaponStat;

public class Shield extends Weapon {

    public Shield() {
        super(7);
    }

    @Override
    public int modifier(WeaponStat weaponStat) {
        if (weaponStat instanceof Attack) {
            return 0;
        } else if (weaponStat instanceof Protection) {
            return 6;
        }
        return 3;
    }
}
