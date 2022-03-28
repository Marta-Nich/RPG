package Item.Equipment.Armor;

import Item.Stat.ItemStat;
import Item.Stat.Weigth;

public class Chestplate extends Armor {
    @Override
    public int modifier(ItemStat itemStat) {
        if (itemStat instanceof Weigth) {
            return 7;
        }
        return 0;
    }
}
