package Inventory;

import Item.IDropeable;
import Item.IPickable;
import Character.Pj;

public class InventoryMock extends Inventory {
    public boolean callPickItem = false;
    public boolean callDropItem = false;

    public InventoryMock(Pj pj) {
        super(pj);
    }

    @Override
    public void pickItem(IPickable pickable) {
        super.pickItem(pickable);
        callPickItem = true;
    }

    @Override
    public void dropItem(IDropeable dropeable) {
        super.dropItem(dropeable);
        callDropItem = true;
    }
}
