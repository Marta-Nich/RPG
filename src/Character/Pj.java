package Character;

import Character.Job.Job;
import Character.Race.Race;
import Character.Stat.Constitution;
import Character.Stat.Dexterity;
import Character.Stat.Intelligence;
import Character.Stat.Strength;

public class Pj {
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

    public Pj(String name, Race race, Job job, Strength strength, Dexterity dexterity, Constitution constitution, Intelligence intelligence) {
        this.name = name;
        this.race = race;
        this.job = job;
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
    }

    //(Valor base Dexterity + bonif. raza + bonif.profesion)*2
    public double velocity() {
        double velocity = 2 * (dexterity.getValue() + race.modifier(strength) + race.modifier(dexterity) + race.modifier(constitution) + race.modifier(intelligence) + job.modifier(strength) + job.modifier(dexterity) + job.modifier(constitution) + job.modifier(intelligence));
        return velocity;
    }

    //(Valor base Strength + bonif. raza + bonif.profesion)*2
    public double power() {
        double power = 2 * (strength.getValue() + race.modifier(strength) + race.modifier(dexterity) + race.modifier(constitution) + race.modifier(intelligence) + job.modifier(strength) + job.modifier(dexterity) + job.modifier(constitution) + job.modifier(intelligence));
        return power;
    }

    //(Valor base Intelligence + bonif. raza + bonif.profesion)*2
    public double magic() {
        double magic = 2 * (intelligence.getValue() + race.modifier(strength) + race.modifier(dexterity) + race.modifier(constitution) + race.modifier(intelligence) + job.modifier(strength) + job.modifier(dexterity) + job.modifier(constitution) + job.modifier(intelligence));
        return magic;
    }

    @Override
    public String toString() {
        return "My name is "+name+"."+
                "I’m an "+getRace()+" "+getJob()+
                "My stats are: "+
                "Strength: "+strength+
                "Dexterity: "+dexterity+
                "Constitution: "+constitution+
                "Velocity: "+velocity()+
                "Power: "+power()+
                "Magic: "+magic()+
                "Health: "+

    }
}
