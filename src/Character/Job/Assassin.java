package Character.Job;

import Character.Stat.*;

public class Assassin extends Job {
    //maria.donzel@iesecaminas.org;
    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Dexterity) {
            return 3;
        }
        if (stat instanceof Strength) {
            return 1;
        }
        if (stat instanceof Constitution) {
            return 1;
        }
        return 0;
    }
}
