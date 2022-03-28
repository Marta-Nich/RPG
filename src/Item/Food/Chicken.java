package Item.Food;

import Character.Pj;
import Item.IConsumable;
import Item.Stat.ItemStat;
import Item.Stat.Weigth;

public class Chicken extends Food implements IConsumable {
    private double power = 25;

    @Override
    public double power() {
        return power;
    }

    @Override
    public void consumedBy(Pj pj) {
        pj.heals(power());
    }

    @Override
    public String toString() {
        return "Chicken { " +
                "power = " + power +
                " }";
    }

    @Override
    public int modifier(ItemStat itemStat) {
        if (itemStat instanceof Weigth) {
            return 3;
        }
        return 0;
    }
}
