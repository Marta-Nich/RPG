package Inventory;

import Item.IPickable;
import Item.IDropeable;
import Character.Pj;

import java.util.LinkedList;

public class Inventory {
    private Pj pj;

    private LinkedList<IPickable> inventory;

    public LinkedList<IPickable> getInventory() {
        return inventory;
    }

    private double maxWeight = 0;

    public double maxWeight() {
        if (pj != null) {
            maxWeight = pj.maxWeigth();
        }
        System.out.print("El peso maximo es de : " + maxWeight);
        return maxWeight;
    }

    private double busyWeigth = 0;

    public double weigthListIPickable() {
        busyWeigth = 0;
        if (inventory != null) {
            for (IPickable pickable : inventory) {
                System.out.println("sumando");
                busyWeigth += pickable.weigth();
            }
        }
        System.out.print("El peso actual es de : " + busyWeigth);
        return busyWeigth;
    }

    public void pickItem(IPickable pickable) {
        pickable.pickUpBy(this);
    }

    public void dropItem(IDropeable dropeable) {
        dropeable.dropBy(this);
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "items=" + inventory +
                '}';
    }
}

