package Item.Food;

import Character.Pj;

public class PoisonousFoodDecorator extends Food {
    private final Food food;
    private int weigth;

    protected PoisonousFoodDecorator(Food food) {
        this.food = food;
    }

    @Override
    public double power() {
        return -food.power();
    }

    @Override
    public int weigthItem() {
        weigth = food.weigthItem();
        return weigth;
    }

    @Override
    public void consumedBy(Pj pj) {
        if (pj.health() - power() > 0) {
            pj.receivesDamage(-this.power());
        } else {
            pj.receivesDamage(pj.maxHealth() - pj.health());
        }
    }

    @Override
    public String toString() {
        return "PoisonousFoodDecorator { " + food +
                " }";
    }
}
