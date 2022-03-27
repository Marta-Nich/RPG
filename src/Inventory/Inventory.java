package Inventory;

import Item.IPickable;
import Item.IDropeable;
import Character.Pj;

import java.util.LinkedList;

public class Inventory {
    private LinkedList<IPickable> items;
    private double weight;

    public double getWeight() {
        return weight;
    }

    public void weigth(Pj pj) {
        weight += pj.maxWeigth();
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

