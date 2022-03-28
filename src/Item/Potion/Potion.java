package Item.Potion;

import Item.IConsumable;
import Character.Pj;
import Item.IDropeable;
import Item.IPickable;
import Item.Item;

public abstract class Potion extends Item implements IConsumable, IPickable, IDropeable {

    @Override
    public double power() {
        return 0;
    }

    @Override
    public void consumedBy(Pj pj) {
        pj.heals(power());
    }

    @Override

    public String toString() {
        return getClass().getSimpleName() +
                " power = " + power();
    }
}
