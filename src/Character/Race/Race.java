package Character.Race;

import Character.Stat.Stat;

public abstract class Race {

    //Devuelve el modificador de la profesión segun el stat
    public abstract int modifier(Stat stat);

    //Devuelve true si son la misma clase
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        return getClass() == obj.getClass();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
