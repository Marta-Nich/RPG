package Item.Potion;

import Item.IConsumable;
import Character.Pj;

public class GreatHealingPotionDecorator extends Potion{
    private final IConsumable greatHealingPotionDecorated;
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

    public GreatHealingPotionDecorator(IConsumable greatHealingPotionDecorated) {
        this.greatHealingPotionDecorated = greatHealingPotionDecorated;
    }

    @Override
    public double power() {
        return greatHealingPotionDecorated.power();
    }

    @Override
    public void consumedBy(Pj pj) {
        if (pj.health() + (power() * 2) <= pj.maxHealth()) {
            pj.heals(power() * 2);
        } else {
            pj.heals(pj.maxHealth() - pj.health());
        }
    }
}
