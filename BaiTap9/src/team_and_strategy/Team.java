package team_and_strategy;

import java.util.ArrayList;
import java.util.List;

public class Team {
    List<Player> players;

    public Team() {
        this.players = new ArrayList<>();
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    //display
    public void display_team() {
        System.out.println("Forward");
        for (Player player : players) {
            if ((player.position).equals("Forward")) {
                System.out.println(player);
            }
        }

        System.out.println("Midfielder");
        for (Player player : players) {
            if ((player.position).equals("Midfielder")) {
                System.out.println(player);
            }
        }

        System.out.println("Defender");
        for (Player player : players) {
            if ((player.position).equals("Defender")) {
                System.out.println(player);
            }
        }
    }

    // total skill level
    public void total_skill_level() {
        int total = 0;
        for (Player player : players) {
            total += player.skill_level;
        }
        System.out.println("Total skill level of team: " + total);
    }

    //add player
    public void add_player(Player player) {
        this.players.add(player);
    }

}
