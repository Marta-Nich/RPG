package Item;

import Inventory.Inventory;

public class ItemMock extends Item {
    public boolean callPickUpBy = false;
    public boolean callDropBy = false;

    @Override
    public void pickUpBy(Inventory inventory) {
        inventory.pickItem(this);
        callPickUpBy = true;
    }

    @Override
    public void dropBy(Inventory inventory) {
        inventory.dropItem(this);
        callDropBy = true;
    }
}
