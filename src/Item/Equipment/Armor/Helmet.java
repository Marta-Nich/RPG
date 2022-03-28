package Item.Equipment.Armor;

import Item.Stat.ItemStat;
import Item.Stat.Weigth;

public class Helmet extends Armor {
    @Override
    public int modifier(ItemStat itemStat) {
        if (itemStat instanceof Weigth) {
            return 5;
        }
        return 0;
    }
}
