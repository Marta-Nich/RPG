package Item.Potion;

import Item.IConsumable;
import Character.Pj;

public abstract class Potion implements IConsumable {
    private double power;

    public Potion(double power) {
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
