package Item.Equipment.Jewelry;

import Item.Equipment.Weapon.Stat.WeaponStat;
import Item.Item;
import Item.Stat.ItemStat;

public abstract class Jewelry extends Item {
    public abstract int modifier(ItemStat itemStat);

    public Jewelry() {

    }
}
