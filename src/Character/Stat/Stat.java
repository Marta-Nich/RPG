package Character.Stat;

public abstract class Stat {
    private int value;

    public Stat(int value) {
        this.value = value;
    }

    //Devuelve el valor actual de la característica
    public double getValue() {
        return value;
    }

    //Aumenta el valor de la característica en 1
    public void increase() {
        value++;
    }

    //Disminuye el valor de la característica en 1
    public void decrease() {
        if (value > 0)
            value--;
    }

    //Devuelve el nombre simple de la clase
    @Override
    public String toString() {
        return "Stat{" +
                "value=" + value +
                '}';
    }
}
