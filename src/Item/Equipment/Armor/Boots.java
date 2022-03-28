package Item.Equipment.Armor;

import Item.Stat.ItemStat;
import Item.Stat.Weigth;

public class Boots extends Armor {

    @Override
    public int modifier(ItemStat itemStat) {
        if (itemStat instanceof Weigth) {
            return 4;
        }
        return 0;
    }
}
