package Character;

import Character.Job.Job;
import Character.Race.Race;
import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Strength;
import Inventory.Inventory;
import Item.IConsumable;
import Inventory.Equipment;

public class Pj implements IDamageable {
    private String name;

    public String getName() {
        return name;
    }

    private Race race;

    public Race getRace() {
        return race;
    }

    private Job job;

    public Job getJob() {
        return job;
    }

    private Strength strength;
    private Dexterity dexterity;
    private Constitution constitution;
    private Intelligence intelligence;
    private double damage = 0;
    private Inventory inventory;
    private Equipment equipment;


    public Pj(String name, Race race, Job job, Strength strength, Dexterity dexterity, Constitution constitution, Intelligence intelligence) {
        this.name = name;
        this.race = race;
        this.job = job;
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
    }

    //Peso que puede llevar en el inventario
    public double maxWeigth() {
        return 3 * (strength.getValue() + constitution.getValue() + race.modifier(dexterity) + race.modifier(constitution) + race.modifier(intelligence)
                + job.modifier(strength) + job.modifier(dexterity) + job.modifier(constitution) + job.modifier(intelligence));
    }

    //(Valor base Dexterity + bonif. raza + bonif.profesion)*2
    public double velocity() {
        return 2 * (dexterity.getValue() + race.modifier(strength) + race.modifier(dexterity) + race.modifier(constitution) + race.modifier(intelligence)
                + job.modifier(strength) + job.modifier(dexterity) + job.modifier(constitution) + job.modifier(intelligence));
    }

    //(Valor base Strength + bonif. raza + bonif.profesion)*2
    public double power() {    /*Mas totalBonus*/
        return equipment.totalBonusAttack() + (2 * (strength.getValue() + race.modifier(strength) + race.modifier(dexterity) + race.modifier(constitution) + race.modifier(intelligence)
                + job.modifier(strength) + job.modifier(dexterity) + job.modifier(constitution) + job.modifier(intelligence)));
    }

    //(Valor base Intelligence + bonif. raza + bonif.profesion)*2
    public double magic() {
        return 2 * (intelligence.getValue() + race.modifier(strength) + race.modifier(dexterity) + race.modifier(constitution) + race.modifier(intelligence)
                + job.modifier(strength) + job.modifier(dexterity) + job.modifier(constitution) + job.modifier(intelligence));
    }

    @Override
    public String toString() {
        return "My name is " + name + "." +
                " I’m an " + getRace() + " " + getJob() +
                " My stats are: " +
                "Strength: " + strength + " " +
                "Dexterity: " + dexterity + " " +
                "Constitution: " + constitution + " " +
                "Velocity: " + velocity() + " " +
                "Power: " + power() + " " +
                "Magic: " + magic() + " " +
                "Health: " + health();

    }

    @Override
    public double maxHealth() {
        return 25 * (constitution.getValue() + race.modifier(strength) + race.modifier(dexterity) + race.modifier(constitution) + race.modifier(intelligence)
                + job.modifier(strength) + job.modifier(dexterity) + job.modifier(constitution) + job.modifier(intelligence));
    }

    @Override
    public double health() {
        double health = maxHealth();
        if (health - damage > 0) {
//            System.out.println(getName() + " Health: " + (health - damage) + "/" + maxHealth());
            return health - damage;
        }
//        System.out.println(getName() + " Health: " + (health - damage) + "/" + maxHealth());
        return 0;
    }

    @Override
    public boolean isDead() {
        return damage >= health();
    }

    @Override
    public void receivesDamage(double amount) {
        if (amount > 0) {
            damage += (amount - equipment.totalBonusProtection());  /*Menos bonusProtection*/
            System.out.println(getName() + " received " + amount + " damage. Health: " + health() + "/" + maxHealth());
        }
    }

    @Override
    public void heals(double amount) {
        if (amount > 0) {
            if (damage <= 0) {
                damage = 0;
                System.out.println(getName() + " healed " + amount + " life. Health: " + health() + "/" + maxHealth());
            }
            damage -= amount;
            System.out.println(getName() + " healed " + amount + " life. Health: " + health() + "/" + maxHealth());

        }
    }

    public void consumes(IConsumable consumable) {
        consumable.consumedBy(this);
        System.out.println(getName() + " consumed: " + consumable);
    }
}
