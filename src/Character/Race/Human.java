package Character.Race;

import Character.Stat.Stat;

public class Human extends Race{
    @Override
    public int modifier(Stat stat) {
        return 0;
    }
}
