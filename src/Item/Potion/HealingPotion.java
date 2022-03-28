package Item.Potion;

public class HealingPotion extends Potion {
    private double power = 50;

    public HealingPotion() {
        super(50,0.5);
    }

    @Override
    public double power() {
        return power;
    }
}
