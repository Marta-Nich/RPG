package Item.Equipment.Armor;

public class Chestplate extends Armor {
    private int powerAttack = 5;
    private int weigth = 7;
    private int protection = 7;
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
