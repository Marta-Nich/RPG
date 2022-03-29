package Item.Food;

import Character.Pj;
import Item.IConsumable;

public class EnhancedFoodDecorator extends Food implements IConsumable {
    private final IConsumable enhancedFoodDecorated;

    public EnhancedFoodDecorator(IConsumable enhancedFoodDecorated) {
        this.enhancedFoodDecorated = enhancedFoodDecorated;
    }

    @Override
    public double power() {
        return enhancedFoodDecorated.power();
    }

    @Override
    public void consumedBy(Pj pj) {
        if (pj.health() + (power() * 2) <= pj.maxHealth()) {
            pj.heals(power() * 2);
        } else {
            pj.heals(pj.maxHealth() - pj.health());
        }
    }

    @Override
    public String toString() {
        return "EnhancedFoodDecorator { " + enhancedFoodDecorated +
                " }";
    }
}