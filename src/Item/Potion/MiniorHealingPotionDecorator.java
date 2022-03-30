package Item.Potion;

import Character.Pj;

public class MiniorHealingPotionDecorator extends Potion {
    private double power = 50 / 2;
    private int weigth = 1;
    private final Potion potion;

    @Override
    public int weigthItem() {
        return weigth;
    }

    public MiniorHealingPotionDecorator(Potion potion) {
        this.potion = potion;
    }

    @Override
    public double power() {
        return power;
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
