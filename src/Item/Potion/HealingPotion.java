package Item.Potion;

import Item.Stat.ItemStat;
import Item.Stat.Weigth;

public class HealingPotion extends Potion {
    private double power = 50;

    public HealingPotion() {
        super(50);
    }

    @Override
    public double power() {
        return power;
    }

    @Override
    public int modifier(ItemStat itemStat) {
        if (itemStat instanceof Weigth) {
            return 2;
        }
        return 0;
    }
}
