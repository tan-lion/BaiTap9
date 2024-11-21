package team_and_strategy;

import java.time.temporal.Temporal;

public class Main {
    public static void main(String[] args) {

        //Declare
        Player player = new Midfielder("Midfielder 1", "Midfielder", 2);
        Player player_2 = new Midfielder("Midfielder 2", "Midfielder", 3);
        Player player_3 = new Midfielder("Midfielder 3", "Midfielder", 4);
        Player player_4 = new Forward("Forward 1", "Forward", 4);
        Player player_5 = new Forward("Forward 2", "Forward", 5);
        Player player_6 = new Forward("Forward 3", "Forward", 6);
        Player player_7 = new Defender("Defender 1", "Defender", 6);
        Player player_8 = new Defender("Defender 2", "Defender", 7);
        Player player_9 = new Defender("Defender 3", "Defender", 8);
        Team team = new Team();

        //Input
        team.add_player(player);
        team.add_player(player_2);
        team.add_player(player_3);
        team.add_player(player_4);
        team.add_player(player_5);
        team.add_player(player_6);
        team.add_player(player_7);
        team.add_player(player_8);
        team.add_player(player_9);

        for (Player player_list : team.players) {
            System.out.print(player_list + "\t");
            System.out.println(player_list.play());
        }
        System.out.println("===================");
        team.display_team();
        System.out.println("===================");
        team.total_skill_level();
    }
}
