package Item.Potion;

import Inventory.Inventory;
import Item.Stat.ItemStat;
import Item.Stat.Weigth;

public class MinorHealingPotion extends Potion {
    private double power = 25;

    public MinorHealingPotion() {
        super(25);
    }

    @Override
    public double power() {
        return power;
    }

    @Override
    public int modifier(ItemStat itemStat) {
        if (itemStat instanceof Weigth) {
            return 1;
        }
        return 0;
    }
}
