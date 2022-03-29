package Item;

import Inventory.Inventory;

public interface IPickable {
    int slotSpace();

    int weigth();

    void pickUpBy(Inventory inventory);
}
