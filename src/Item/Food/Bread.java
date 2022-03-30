package Item.Food;

import Item.IConsumable;

public class Bread extends Food implements IConsumable {
    private double power = 10;
    private int weigth = 2;

    @Override
    public int weigthItem() {
        return weigth;
    }

    @Override
    public double power() {
        return power;
    }

    @Override
    public String toString() {
        return "Bread { " +
                "power = " + power +
                " }";
    }
}
