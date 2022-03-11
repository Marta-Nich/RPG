package Character.Race;

import Character.Stat.*;

public class Lich extends Race{
    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Constitution) {
            return -3;
        }
        if (stat instanceof Intelligence) {
            return 5;
        }
        if (stat instanceof Strength) {
            return 3;
        }
        return 0;
    }
}
