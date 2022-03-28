package Item.Potion;

import Character.Pj;
import Item.IConsumable;
import Item.Stat.ItemStat;

public class MiniorHealingPotionDecorator extends Potion implements IConsumable {
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
        pj.heals(this.power() / 2);
    }

    @Override
    public int modifier(ItemStat itemStat) {
        return 0;
    }
}
