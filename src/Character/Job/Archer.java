package Character.Job;

import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Stat;
import Character.Stat.Strength;

public class Archer extends Job {

    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Strength) {
            return 2;
        }
        if (stat instanceof Intelligence) {
            return 2;
        }
        if (stat instanceof Dexterity) {
            return 1;
        }
        return 0;
    }
    /*
    * Iequipable extends (Ipicable extends Idropablreextends Iidentificablrd)*/
    /*Pj lista de slots
    * manager del equipo*/
}
