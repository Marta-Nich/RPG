package Inventory;

import Item.IPickable;
import Item.IDropeable;
import Character.Pj;

import java.util.LinkedList;

public class Inventory {
    private LinkedList<IPickable> inventory = new LinkedList<>();

    public double maxWeight() {
        double maxWeight = pj.maxWeigth();
        return maxWeight;
    }

    private double busyWeigth = 0;
    private Pj pj;

    public Inventory(Pj pj) {
        this.pj = pj;
    }

    public double weigthListIPickable() {
        busyWeigth = 0;
        for (IPickable pickable : inventory) {
            busyWeigth += pickable.weigthItem();
        }
        return busyWeigth;
    }

    public void pickItem(IPickable pickable) {
        if (pickable.weigthItem() + weigthListIPickable() <= maxWeight()) {
            inventory.add(pickable);

        }
    }

    public void dropItem(IDropeable dropeable) {
        if (inventory != null) {
            inventory.remove(dropeable);
        }
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "items=" + inventory +
                '}';
    }
}

