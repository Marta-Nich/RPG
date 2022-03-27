package Item;

import Inventory.Inventory;

public class Item implements IPickable, IDropeable {
    private double weight;

    public double getWeight() {
        return weight;
    }

    @Override
    public void pickUpBy(Inventory inventory) {
        if (inventory.getWeight() > weight) {
            inventory.add(this);
        }
    }

    @Override
    public void dropBy(Inventory inventory) {
        inventory.drop(this);
    }
}
