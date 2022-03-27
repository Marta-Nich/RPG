package Item;

import Inventory.Inventory;

public interface IPickable {
    abstract void pickUpBy(Inventory inventory);
}
