package Item.Food;

import Inventory.Inventory;
import Item.Item;
import Item.IConsumable;
import Character.Pj;

public abstract class Food extends Item implements IConsumable {
    private int weigth = 0;
    private double power = 0;

    @Override
    public int weigthItem() {
        return weigth;
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

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " power = " + power();
    }
}
