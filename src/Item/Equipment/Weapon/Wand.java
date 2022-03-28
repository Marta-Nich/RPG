package Item.Equipment.Weapon;

import Item.Equipment.Weapon.Stat.Attack;
import Item.Equipment.Weapon.Stat.Protection;
import Item.Equipment.Weapon.Stat.WeaponStat;

public class Wand extends Weapon {

    public Wand() {
        super(4);
    }

    @Override
    public int modifier(WeaponStat weaponStat) {
        if (weaponStat instanceof Attack) {
            return 2;
        } else if (weaponStat instanceof Protection) {
            return 1;
        }
        return 5;
    }
}
