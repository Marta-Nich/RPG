package Item.Equipment.Weapon;

public class Wand extends Weapon {
    private int powerAttack = 2;
    private int weigth = 4;
    private int protection = 1;
    private int slotSpace = 2;
    private double speed=2.5;

    @Override
    public int powerAttack() {
        return powerAttack;
    }

    @Override
    public int protection() {
        return protection;
    }

    @Override
    public int weigth() {
        return weigth;
    }

    @Override
    public int slotSpace() {
        return slotSpace;
    }

    @Override
    public double getSpeed() {
        return speed;
    }

    @Override
    public double bonusAttack() {
        return powerAttack;
    }

    @Override
    public double nerfWeigth() {
        return weigth;
    }

    @Override
    public double bonusSpeed() {
        return speed;
    }

    @Override
    public double bonusProtection() {
        return protection;
    }

    @Override
    public double totalBonus() {
        return (bonusAttack() * bonusSpeed()) - nerfWeigth();
    }
}
