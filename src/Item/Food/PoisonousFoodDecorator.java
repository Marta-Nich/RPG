package Item.Food;

import Character.Pj;

public abstract class PoisonousFoodDecorator extends Food {
    private Food food;

    public PoisonousFoodDecorator(Food food) {
        super(food.getPower());
    }

    @Override
    public void consumedBy(Pj pj) {
        pj.receivesDamage(-food.getPower());
    }
}
