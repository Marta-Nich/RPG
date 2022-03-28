package Item.Food;

import Character.Pj;
import Item.IConsumable;

public class LeekCream extends Food implements IConsumable {
    private double power = 50;

    public LeekCream() {
        super(2.5);
    }

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
        return "LeekCream { " +
                "power = " + power +
                " }";
    }
}
