package Item;

import Inventory.Inventory;

public interface IPickable {
    int weigth();

    void pickUpBy(Inventory inventory);
}
