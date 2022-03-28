package Item.Stat;

import Item.Item;

public abstract class ItemStat extends Item {
    private int value;

    public ItemStat(int value) {
        this.value = value;
    }

    //Devuelve el valor actual de la característica
    public double getValue() {
        return value;
    }
}
