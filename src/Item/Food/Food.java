package Item.Food;

import Item.Item;
import Item.IConsumable;
import Character.Pj;

public abstract class Food extends Item implements IConsumable {

    public Food(double weigth) {
        super(weigth);
    }

    @Override
    public double power() {
        return 0;
    }

    @Override
    public void consumedBy(Pj pj) {
        pj.heals(power());
    }
}
