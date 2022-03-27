package Item.Food;

import Character.Pj;

public abstract class EnhancedFoodDecorator extends Food {
    private Food food;

    public EnhancedFoodDecorator(Food food) {
        super(food.getPower());
    }

    @Override
    public void consumedBy(Pj pj) {
        pj.heals(food.getPower() * 2);

    }

    //    public EnhancedFoodDecorator(Food food) {
//        super(food.getPower() * 2);
//    }
}
