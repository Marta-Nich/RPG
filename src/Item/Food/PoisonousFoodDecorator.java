package Item.Food;

import Character.Pj;
import Item.IConsumable;

public class PoisonousFoodDecorator extends Food implements IConsumable {
    private final IConsumable poisonousFoodDecorated;

    protected PoisonousFoodDecorator(IConsumable poisonousFoodDecorated) {
        super(0);
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
