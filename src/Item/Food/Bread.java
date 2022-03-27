package Item.Food;

import Character.Pj;
import Item.IConsumable;

public class Bread implements IConsumable {
    private double power = 10;

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
        return "Bread { " +
                "power = " + power +
                " }";
    }
}
