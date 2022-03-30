package Item;

import Inventory.Inventory;

public abstract class Item implements IPickable, IDropeable {
    private int weigth = 0;

    public int weigth() {
        return weigth;
    }

    @Override
    public void pickUpBy(Inventory inventory) {
        if (inventory.getInventory() != null) {
            if (this.weigth() + inventory.weigthListIPickable() <= inventory.maxWeight()) {
                inventory.pickItem(this);
                inventory.getInventory().add(this);
            }
        }
    }

    @Override
    public void dropBy(Inventory inventory) {
        if (inventory != null) {
            if (inventory.getInventory().contains(this)) {
                inventory.dropItem(this);
                inventory.getInventory().remove(this);
            }
        }
    }
}
