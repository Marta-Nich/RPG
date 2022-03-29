package Item.Potion;

import Character.Pj;

public class GreatHealingPotionDecorator extends Potion {
    private final Potion potion;
    private int weigth = 3;
    private int slotSpace = 1;

    @Override
    public int slotSpace() {
        return slotSpace;
    }

    @Override
    public int weigth() {
        return weigth;
    }

    public GreatHealingPotionDecorator(Potion potion) {
        this.potion = potion;
    }

    @Override
    public double power() {
        return potion.power() * 2;
    }

    @Override
    public void consumedBy(Pj pj) {
        if (pj.health() + (power() * 2) <= pj.maxHealth()) {
            pj.heals(power());
        } else {
            pj.heals(pj.maxHealth() - pj.health());
        }
    }
}
