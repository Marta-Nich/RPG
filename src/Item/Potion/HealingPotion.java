package Item.Potion;

import Item.Stat.ItemStat;
import Item.Stat.Weigth;
import Character.Pj;

public class HealingPotion extends Potion {
    private double power = 50;

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

    @Override
    public void consumedBy(Pj pj) {
        pj.heals(power());
    }

    @Override
    public String toString() {
        return "HealingPotion { " +
                "power = " + power +
                " }";
    }
}
