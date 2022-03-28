package Item.Equipment.Weapon;

import Character.Stat.Strength;
import Item.Equipment.Weapon.Stat.Attack;
import Item.Equipment.Weapon.Stat.Protection;
import Item.Equipment.Weapon.Stat.WeaponStat;

public class Sword extends Weapon {

    public Sword() {
        super(6);
    }

    @Override
    public int modifier(WeaponStat weaponStat) {
        if (weaponStat instanceof Attack) {
            return 3;
        } else if (weaponStat instanceof Protection) {
            return 3;
        }
        return 4;
    }
}
