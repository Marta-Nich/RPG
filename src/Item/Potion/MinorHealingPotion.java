package Item.Potion;

import Inventory.Inventory;

public class MinorHealingPotion extends Potion{
    private double power = 25;
    public MinorHealingPotion() {
        super(25,0.25);
    }

    @Override
    public double power() {
        return power;
    }

    @Override
    public void dropBy(Inventory inventory) {

    }

    @Override
    public void pickUpBy(Inventory inventory) {

    }
}
