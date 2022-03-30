package Item.Food;

import Character.Pj;
import Item.IConsumable;

public class Apple extends Food implements IConsumable {
    private double power = 5;
    private int weigth = 1;

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
        return "Apple { " +
                "power = " + power +
                " }";
    }
}
