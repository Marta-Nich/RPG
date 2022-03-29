package Item.Food;

import Character.Pj;
import Item.IConsumable;

public class EnhancedFoodDecorator extends Food implements IConsumable {
    private final Food food;

    public EnhancedFoodDecorator(Food food) {
        this.food = food;
    }

    @Override
    public double power() {
        return food.power() * 2;
    }

    @Override
    public void consumedBy(Pj pj) {
        if (pj.health() + (power()) <= pj.maxHealth()) {
            pj.heals(power());
        } else {
            pj.heals(pj.maxHealth() - pj.health());
        }
    }

    @Override
    public String toString() {
        return "EnhancedFoodDecorator { " + food +
                " }";
    }
}
