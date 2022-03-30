package Item.Equipment.Weapon;

public class Knife extends Weapon {
    private int powerAttack = 1;
    private int weigth = 2;
    private int protection = 1;
    private int slotSpace = 1;
    private double speed = 7.5;

    @Override
    public int powerAttack() {
        return powerAttack;
    }

    @Override
    public int protection() {
        return protection;
    }

    @Override
    public int weigthItem() {
        return weigth;
    }

    @Override
    public int weigthEquip() {
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
