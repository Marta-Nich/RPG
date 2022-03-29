package Character;

import Character.Job.Job;
import Character.Race.Race;
import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Strength;
import Item.IConsumable;

public class ConsumesMock extends Pj {

    public boolean callConsumed = false;

    public ConsumesMock(String name, Race race, Job job, Strength strength, Dexterity dexterity, Constitution constitution, Intelligence intelligence) {
        super(name, race, job, strength, dexterity, constitution, intelligence);
    }

    @Override
    public void consumes(IConsumable consumable) {
        consumable.consumedBy(this);
        callConsumed = true;
    }

    @Override
    public double power() {
        return 0;
    }
}
