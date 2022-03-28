package Item.Equipment.Weapon;

import Item.Equipment.Weapon.Stat.WeaponStat;
import Item.Item;

public abstract class Weapon extends Item {

    public abstract int modifier(WeaponStat weaponStat);

}
