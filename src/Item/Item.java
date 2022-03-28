package Item;

import Inventory.Inventory;

public abstract class Item implements IPickable, IDropeable {
    private double weight;

    protected Item(double weight) {
        this.weight = weight;
    }

    @Override
    public void pickUpBy(Inventory inventory) {
        if (inventory.getMaxWeight() > weight) {
            if (inventory.currentWeigth() > weight)
                inventory.add(this);
        }
    }

    @Override
    public void dropBy(Inventory inventory) {
        inventory.drop(this);
    }
}
