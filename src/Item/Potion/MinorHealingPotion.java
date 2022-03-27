package Item.Potion;

public class MinorHealingPotion extends Potion{
    private double power = 25;
    public MinorHealingPotion() {
        super(25);
    }

    @Override
    public double power() {
        return power;
    }
}
