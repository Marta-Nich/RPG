package Item;

import Inventory.Inventory;

public interface IDropeable {
    abstract void dropBy(Inventory inventory);
}
