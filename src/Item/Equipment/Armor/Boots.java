package Item.Equipment.Armor;

public class Boots extends Armor {
    private int powerAttack = 2;
    private int weigth = 3;
    private int protection = 4;
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
}
