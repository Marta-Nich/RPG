package Item.Equipment.Jewelry;

import Item.Equipment.Weapon.Stat.WeaponStat;
import Item.Stat.ItemStat;
import Item.Stat.Weigth;

public class Necklace extends Jewelry {

    @Override
    public int modifier(ItemStat itemStat) {
        if (itemStat instanceof Weigth) {
            return 3;
        }
        return 0;
    }
}
