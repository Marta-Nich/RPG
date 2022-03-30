package Item;

import Character.Pj;

public abstract class Item implements IPickable, IDropeable {
    private int weigth = 0;

    public int weigthItem() {
        return this.weigth;
    }

    @Override
    public void pickUpBy(Pj pj) {
        pj.putInventory(this);
    }

    @Override
    public void dropBy(Pj pj) {
        pj.removeInventory(this);
    }
}
