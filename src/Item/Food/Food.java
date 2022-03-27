package Item.Food;

import Character.Pj;
import Item.IConsumable;

public abstract class Food implements IConsumable {
    private double power;

    public double getPower() {
        return power;
    }

    public Food(double power) {
        this.power = power;
    }

    @Override
    public void consumedBy(Pj pj) {
        pj.heals(power);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " power = " + power;
    }
}
