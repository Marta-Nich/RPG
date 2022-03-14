package Character.Job;

import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Stat;
import Character.Stat.Strength;

public class Tamer extends Job {

    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Intelligence) {
            return 2;
        }
        if (stat instanceof Dexterity) {
            return 2;
        }
        if (stat instanceof Strength) {
            return 1;
        }
        return 0;
    }
}
