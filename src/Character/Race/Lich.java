package Character.Race;

import Character.Stat.Stat;

public class Lich extends Race{
    //constitucion mala
    //inteligencia y fuerza alta
    @Override
    public int modifier(Stat stat) {
        return 0;
    }
}
