package Item.Potion;

import Item.IConsumable;
import Character.Pj;
import Item.IDropeable;
import Item.IPickable;
import Item.Item;

public abstract class Potion extends Item implements IConsumable, IPickable, IDropeable {
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
