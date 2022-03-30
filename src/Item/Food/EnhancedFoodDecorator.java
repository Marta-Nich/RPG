package Item.Food;

import Character.Pj;

public class EnhancedFoodDecorator extends Food {
    private final Food food;
    private int weigth;

    public EnhancedFoodDecorator(Food food) {
        this.food = food;
    }

    @Override
    public double power() {
        return food.power() * 2;
    }

    @Override
    public int weigth() {
        weigth = food.weigth();
        return weigth;
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
