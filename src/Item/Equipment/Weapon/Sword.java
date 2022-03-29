package Item.Equipment.Weapon;

public class Sword extends Weapon {
    private int powerAttack = 3;
    private int weigth = 5;
    private int protection = 3;
    private int slotSpace = 1;
    private double speed = 5.5;

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
