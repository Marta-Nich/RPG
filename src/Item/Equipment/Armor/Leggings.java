package Item.Equipment.Armor;

import Item.Stat.ItemStat;
import Item.Stat.Weigth;

public class Leggings extends Armor {
    @Override
    public int modifier(ItemStat itemStat) {
        if (itemStat instanceof Weigth) {
            return 6;
        }
        return 0;
    }
}
