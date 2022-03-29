package Item;

import Character.Pj;

public class ConsumedByMock implements IConsumable {
    public boolean callConsumedBy = false;


    @Override
    public double power() {
        return 0;
    }

    @Override
    public void consumedBy(Pj pj) {
        callConsumedBy = true;
        if (pj.health() + power() <= pj.maxHealth()) {
            pj.heals(power());
        } else {
            pj.heals(pj.maxHealth() - pj.health());
        }
    }
}
