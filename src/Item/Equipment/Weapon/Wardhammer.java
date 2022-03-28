package Item.Equipment.Weapon;

import Item.Equipment.Weapon.Stat.Attack;
import Item.Equipment.Weapon.Stat.Protection;
import Item.Equipment.Weapon.Stat.WeaponStat;

public class Wardhammer extends Weapon {

    public Wardhammer() {
        super(9);
    }

    @Override
    public int modifier(WeaponStat weaponStat) {
        if (weaponStat instanceof Attack) {
            return 7;
        } else if (weaponStat instanceof Protection) {
            return 2;
        }
        return 1;
    }
}
