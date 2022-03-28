package Inventory;

import Item.IPickable;
import Item.IDropeable;
import Character.Pj;

import java.util.LinkedList;

public class Inventory {
    private Pj pj;

    private LinkedList<IPickable> items;

    private double maxWeight = pj.maxWeigth();

    public double getMaxWeight() {
        return maxWeight;
    }

//    private double itemsWeigth = 0;

    private double busyWeigth = 0;

    public double currentWeigth() {
        return busyWeigth;

    }

    public void add(IPickable pickable) {
        items.add(pickable);
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "items=" + items +
                '}';
    }

    public void pick(IPickable pickable) {
        pickable.pickUpBy(this);
    }

    public void drop(IDropeable dropeable) {
        if (items.contains(dropeable)) {
            dropeable.dropBy(this);
        }
    }
}

