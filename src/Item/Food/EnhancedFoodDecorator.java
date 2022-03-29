package Item.Food;

import Character.Pj;

public class EnhancedFoodDecorator extends Food {
    private final Food food;
    private int weigth;
    private int slotSpace = 1;

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
    public int slotSpace() {
        return slotSpace;
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
