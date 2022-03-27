package Item;

import Character.Pj;
import Inventory.Inventory;

public interface IConsumable {
    double power();

    void consumedBy(Pj pj);
}
