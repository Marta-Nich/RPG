package Item.Stat;

public class Weigth extends ItemStat {

    public Weigth(int value) {
        super(value);
    }

    @Override
    public int modifier(ItemStat itemStat) {
        if (itemStat instanceof Weigth) {
            return 3;
        }
        return 0;
    }
}
