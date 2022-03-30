package Inventory;

import Item.IDropeable;
import Item.IPickable;

public class InventoryMock extends Inventory {
    public boolean callPickItem = false;
    public boolean callDropItem = false;

    @Override
    public void pickItem(IPickable pickable) {
        callPickItem = true;
    }

    @Override
    public void dropItem(IDropeable dropeable) {
        callDropItem = true;
    }
}
