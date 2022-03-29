package Item.Potion;

import Character.Pj;
import Item.IConsumable;

public class MiniorHealingPotionDecorator extends Potion{
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

    private final IConsumable miniorHealingPotionDecorated;

    public MiniorHealingPotionDecorator(IConsumable miniorHealingPotionDecorated) {
        this.miniorHealingPotionDecorated = miniorHealingPotionDecorated;
    }

    @Override
    public double power() {
        return miniorHealingPotionDecorated.power();
    }

    @Override
    public void consumedBy(Pj pj) {
        if (pj.health() + (power() / 2) <= pj.maxHealth()) {
            pj.heals(power() / 2);
        } else {
            pj.heals(pj.maxHealth() - pj.health());
        }
    }
}
