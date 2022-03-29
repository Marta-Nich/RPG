package Item.Food;

import Item.IConsumable;

public class LeekCream extends Food implements IConsumable {
    private double power = 50;
    private int weigth = 4;
    private int slotSpace = 1;

    @Override
    public int slotSpace() {
        return slotSpace;
    }

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
        return "LeekCream { " +
                "power = " + power +
                " }";
    }
}
