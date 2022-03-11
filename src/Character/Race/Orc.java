package Character.Race;

import Character.Stat.Stat;
import Character.Stat.Strength;

public class Orc extends Race {
    //Para saber que el tipo de stat puedes usar instanceof
    @Override
    public int modifier(Stat stat) {
        if (stat instanceof Strength) {

        }

        return 0;
    }
}
