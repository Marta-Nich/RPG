package Item.Food;

import Item.Item;
import Item.IConsumable;
import Character.Pj;

public abstract class Food extends Item implements IConsumable {
    private int weigth = 0;
    private int slotSpace = 0;
    private double power = 0;

    @Override
    public int slotSpace() {
        return slotSpace;
    }

    @Override
    public int weigth() {
        return weigth;
    }

    public Food() {

    }

    @Override
    public double power() {
        return power;
    }

    @Override
    public void consumedBy(Pj pj) {
        if (pj.health() + power() <= pj.maxHealth()) {
            pj.heals(power());
        } else {
            pj.heals(pj.maxHealth() - pj.health());
        }
    }
}
