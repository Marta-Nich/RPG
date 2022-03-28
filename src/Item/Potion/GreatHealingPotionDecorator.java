package Item.Potion;

import Item.IConsumable;
import Item.Stat.ItemStat;
import Character.Pj;

public class GreatHealingPotionDecorator extends Potion implements IConsumable {
    private final IConsumable greatHealingPotionDecorated;

    public GreatHealingPotionDecorator(IConsumable greatHealingPotionDecorated) {
        this.greatHealingPotionDecorated = greatHealingPotionDecorated;
    }

    @Override
    public double power() {
        return greatHealingPotionDecorated.power();
    }

    @Override
    public void consumedBy(Pj pj) {
        pj.heals(this.power() * 2);
    }

    @Override
    public int modifier(ItemStat itemStat) {
        return 0;
    }
}
