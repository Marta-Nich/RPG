package Item.Food;

import Character.Pj;
import Item.IConsumable;

public class Apple extends Food implements IConsumable {
    private double power = 5;

    public Apple(){
        super(0.5);
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
        return "Apple { " +
                "power = " + power +
                " }";
    }
}
