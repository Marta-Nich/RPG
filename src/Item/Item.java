package Item;

import Inventory.Inventory;

public abstract class Item implements IPickable, IDropeable {
    private int weigth = 0;
    private int slotSpace = 0;

    @Override
    public int slotSpace() {
        return slotSpace;
    }

    @Override
    public int weigth() {
        return weigth;
    }

    @Override
    public void pickUpBy(Inventory inventory) {
        if (inventory.getMaxWeight() > 0) {
            if (inventory.currentWeigth() > 0)
                inventory.add(this);
        }
    }

    @Override
    public void dropBy(Inventory inventory) {
        inventory.drop(this);
    }
}
