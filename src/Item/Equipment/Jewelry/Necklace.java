package Item.Equipment.Jewelry;

public class Necklace extends Jewelry {
    private int powerAttack = 2;
    private int weigth = 2;
    private int protection = 1;
    private int slotSpace = 1;

    @Override
    public int powerAttack() {
        return powerAttack;
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
    public int protection() {
        return protection;
    }

}
