package Item.Potion;

import Character.Pj;

public class HealingPotion extends Potion {
    private double power = 50;
    private int weigth = 2;
    private int slotSpace = 1;

    @Override
    public int slotSpace() {
        return slotSpace;
    }

    @Override
    public int weigth() {
        return weigth;
    }

    @Override
    public double power() {
        return power;
    }

    @Override
    public void consumedBy(Pj pj) {
        if (pj.health() + power() <= pj.maxHealth()) {
            pj.heals(power());
        } else {
            pj.heals(pj.maxHealth() - pj.health());
        }
    }

    @Override
    public String toString() {
        return "HealingPotion { " +
                "power = " + power +
                " }";
    }
}
