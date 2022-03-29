package Character.Race;

import Character.Stat.*;

public class RaceMock extends Race {
    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Dexterity) {
            return 3;
        }
        if (stat instanceof Intelligence) {
            return 3;
        }
        if (stat instanceof Constitution) {
            return -1;
        }
        return 0;
    }
}
