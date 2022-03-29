package Item.Food;

import Character.Pj;
import Item.IConsumable;

public class PoisonousFoodDecorator extends Food implements IConsumable {
    private final Food food;
    private int weigth = 1;
    private int slotSpace = 1;

    protected PoisonousFoodDecorator(Food food) {
        this.food = food;
    }

    @Override
    public double power() {
        return food.power();
    }

    @Override
    public int weigth() {
        return weigth();
    }

    @Override
    public int slotSpace() {
        return slotSpace();
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
