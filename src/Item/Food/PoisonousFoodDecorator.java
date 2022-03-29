package Item.Food;

import Character.Pj;
import Item.IConsumable;

public class PoisonousFoodDecorator extends Food implements IConsumable {
    private final IConsumable poisonousFoodDecorated;

    protected PoisonousFoodDecorator(IConsumable poisonousFoodDecorated) {
        this.poisonousFoodDecorated = poisonousFoodDecorated;
    }

    @Override
    public double power() {
        return poisonousFoodDecorated.power();
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
        return "PoisonousFoodDecorator { " + poisonousFoodDecorated +
                " }";
    }
}
