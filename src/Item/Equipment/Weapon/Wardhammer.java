package Item.Equipment.Weapon;

public class Wardhammer extends Weapon {
    private int powerAttack = 7;
    private int weigth = 8;
    private int protection = 2;
    private int slotSpace = 2;
    private double speed = 2;

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
