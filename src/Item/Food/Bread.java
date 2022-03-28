package Item.Food;

import Character.Pj;
import Item.IConsumable;

public class Bread extends Food implements IConsumable {
    private double power = 10;

    public Bread() {
        super(1);
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
        return "Bread { " +
                "power = " + power +
                " }";
    }
}
