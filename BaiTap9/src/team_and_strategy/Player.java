package team_and_strategy;

public abstract class Player {
    protected String name;
    protected String position;
    protected int skill_level;

    public Player(String name, String position, int skill_level) {
        this.name = name;
        this.position = position;
        this.skill_level = skill_level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSkill_level() {
        return skill_level;
    }

    public void setSkill_level(int skill_level) {
        this.skill_level = skill_level;
    }

    public abstract String play();

    @Override
    public String toString() {
        return "name: " + name +
                ", position: " + position +
                ", skill_level: " + skill_level;
    }
}
