package Item.Food;

import Character.Pj;
import Item.IConsumable;

public class EnhancedFoodDecorator extends Food implements IConsumable {
    private final IConsumable enhancedFoodDecorated;

    public EnhancedFoodDecorator(IConsumable enhancedFoodDecorated) {
        super(0);
        this.enhancedFoodDecorated = enhancedFoodDecorated;
    }

    @Override
    public double power() {
        return enhancedFoodDecorated.power();
    }

    @Override
    public void consumedBy(Pj pj) {
        pj.heals(this.power() * 2);
    }

    @Override
    public String toString() {
        return "EnhancedFoodDecorator { " + enhancedFoodDecorated +
                " }";
    }
}
