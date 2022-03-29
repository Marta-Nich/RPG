package Item.Equipment.Armor;

public class Helmet extends Armor {
    private int powerAttack = 3;
    private int weigth = 4;
    private int protection = 5;
    private int slotSpace = 1;

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
    public double bonusAttack() {
        return powerAttack * 2;
    }

    @Override
    public double nerfWeigth() {
        return weigth;
    }

    @Override
    public double bonusProtection() {
        return protection;
    }

    @Override
    public double totalBonus() {
        return bonusAttack() - nerfWeigth();
    }
}
