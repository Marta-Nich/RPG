package Item.Potion;

import Character.Pj;

public class MiniorHealingPotionDecorator extends Potion {
    private int weigth = 1;
    private int slotSpace = 1;

    @Override
    public int slotSpace() {
        return slotSpace;
    }

    @Override
    public int weigth() {
        return weigth;
    }

    private final Potion potion;

    public MiniorHealingPotionDecorator(Potion potion) {
        this.potion = potion;
    }

    @Override
    public double power() {
        return potion.power() / 2;
    }

    @Override
    public void consumedBy(Pj pj) {
        if (pj.health() + (power()) <= pj.maxHealth()) {
            pj.heals(power());
        } else {
            pj.heals(pj.maxHealth() - pj.health());
        }
    }
}
