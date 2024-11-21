package team_and_strategy;

public class Defender extends Player {
    public Defender(String name, String position, int skill_level) {
        super(name, position, skill_level);
    }

    @Override
    public String play() {
        return "Support Goalkeeper";
    }

    @Override
    public String toString() {
        return "name: " + name +
                ", position: " + position +
                ", skill_level: " + skill_level;
    }
}
