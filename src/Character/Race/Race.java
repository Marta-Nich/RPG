package Character.Race;

import Character.Stat.Stat;

public abstract class Race {
    //Devuelve el modificador de la profesión segun el stat
    public abstract int modifier(Stat stat);

    @Override
//Devuelve true si son la misma clase
    public boolean equals(Object obj) {
//        if () {
//            return true;
//        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
