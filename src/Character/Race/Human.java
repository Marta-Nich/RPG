package Character.Race;

import Character.Stat.*;

public class Human extends Race{
    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Strength) {
            return 2;
        }
        if (stat instanceof Constitution) {
            return 2;
        }
        if (stat instanceof Dexterity) {
            return 1;
        }
        return 0;
    }
}
