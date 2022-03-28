package Item.Potion;

public class GreaterHealingPotion extends Potion {
    private double power = 100;

    public GreaterHealingPotion() {
        super(100,1);
    }

    @Override
    public double power() {
        return power;
    }

}
