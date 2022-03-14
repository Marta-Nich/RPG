package Character.Race;

import Character.Stat.Stat;

public class RaceMock extends Race{
    @Override
    public int modifier(Stat stat) {
        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
