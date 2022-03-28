package Item.Equipment.Weapon;

import Item.Equipment.Weapon.Stat.WeaponStat;
import Item.Item;

public abstract class Weapon extends Item {
    private double attack;

    private double speed;

    public abstract int modifier(WeaponStat weaponStat);

    public Weapon(double weigth) {
        super(0);
    }
}
