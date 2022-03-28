package Item;

import Inventory.Inventory;
import Item.Stat.ItemStat;
import Item.Stat.Weigth;

public abstract class Item implements IPickable, IDropeable {
    //Devuelve el modificador del stat
    public abstract int modifier(ItemStat itemStat);

    @Override
    public void pickUpBy(Inventory inventory) {
        if (inventory.getMaxWeight() > 0) {
            if (inventory.currentWeigth() > 0)
                inventory.add(this);
        }
    }

    @Override
    public void dropBy(Inventory inventory) {
        inventory.drop(this);
    }
}
