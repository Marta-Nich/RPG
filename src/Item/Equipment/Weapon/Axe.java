package Item.Equipment.Weapon;

import Item.Equipment.Weapon.Stat.Attack;
import Item.Equipment.Weapon.Stat.Protection;
import Item.Equipment.Weapon.Stat.WeaponStat;

public class Axe extends Weapon {

    public Axe() {
        super(8);
    }

    @Override
    public int modifier(WeaponStat weaponStat) {
        if (weaponStat instanceof Attack) {
            return 5;
        } else if (weaponStat instanceof Protection) {
            return 2;
        }
        return 2;
    }
}
