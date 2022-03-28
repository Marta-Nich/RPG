package Item.Potion;

import Item.Stat.ItemStat;
import Item.Stat.Weigth;

public class GreaterHealingPotion extends Potion {
    private double power = 100;

    public GreaterHealingPotion() {
        super(100);
    }

    @Override
    public double power() {
        return power;
    }

    @Override
    public int modifier(ItemStat itemStat) {
        if (itemStat instanceof Weigth) {
            return 3;
        }
        return 0;
    }
}
