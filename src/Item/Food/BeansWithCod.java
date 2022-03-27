package Item.Food;

import Character.Pj;
import Item.IConsumable;

public class BeansWithCod implements IConsumable {
    private double power = 100;

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
        return "BeansWithCod { " +
                "power = " + power +
                " }";
    }
}
