package Item.Equipment.Weapon;

public class Shield extends Weapon {
    private int powerAttack = 0;
    private int weigth = 6;
    private int protection = 9;
    private int slotSpace = 1;
    private double speed = 10;

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
