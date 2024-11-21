package team_and_strategy;

public class Midfielder extends Player {

    public Midfielder(String name, String position, int skill_level) {
        super(name, position, skill_level);
    }

    @Override
    public String play() {
        return "Attack or Defend";
    }

    @Override
    public String toString() {
        return "name: " + name +
                ", position: " + position +
                ", skill_level: " + skill_level;
    }
}
