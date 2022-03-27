package Item;

import Character.Pj;
import Inventory.Inventory;

public interface IConsumable {
    abstract void consumedBy(Pj pj);
}
