package Item.Food;

import Item.IConsumable;

public class BeansWithCod extends Food implements IConsumable {
    private double power = 100;
    private int weigth = 5;
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
        return "BeansWithCod { " +
                "power = " + power +
                " }";
    }
}
