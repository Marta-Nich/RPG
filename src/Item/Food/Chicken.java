package Item.Food;

import Character.Pj;
import Item.IConsumable;

public class Chicken implements IConsumable {
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
}
