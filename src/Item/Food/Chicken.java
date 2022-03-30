package Item.Food;

import Item.IConsumable;

public class Chicken extends Food implements IConsumable {
    private double power = 25;
    private int weigth = 3;

    @Override
    public int weigth() {
        return weigth;
    }

    @Override
    public double power() {
        return power;
    }

    @Override
    public String toString() {
        return "Chicken { " +
                "power = " + power +
                " }";
    }
}
