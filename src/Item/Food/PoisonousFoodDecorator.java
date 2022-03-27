package Item.Food;

import Character.Pj;
import Item.IConsumable;

public class PoisonousFoodDecorator implements IConsumable {
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
        pj.receivesDamage(-this.power());
    }

    @Override
    public String toString() {
        return "PoisonousFoodDecorator { " + poisonousFoodDecorated +
                " }";
    }
}
