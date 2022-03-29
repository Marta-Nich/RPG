package Item.Equipment.Weapon;

public class Axe extends Weapon {
    private int powerAttack = 5;
    private int weigth = 7;
    private int protection = 2;
    private int slotSpace = 1;
    private double speed = 3;

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
    public double totalAttackBonus() {
        return powerAttack() * getSpeed();
    }
}
