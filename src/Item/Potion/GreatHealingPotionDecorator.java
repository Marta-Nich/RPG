package Item.Potion;

import Character.Pj;

public class GreatHealingPotionDecorator extends Potion {
    private double power = 50 * 2;
    private final Potion potion;
    private int weigth = 3;

    @Override
    public int weigthItem() {
        return weigth;
    }

    public GreatHealingPotionDecorator(Potion potion) {
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
