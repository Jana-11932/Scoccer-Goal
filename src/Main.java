import soccer.play.*;

public class Main {
    public static void main(String[] args) {
        Team robins = new Team("The Robins");
        Team hens = new Team("The Hens");
        Team owls = new Team("The Owls");
        Team swallows = new Team("The Swallows");
        Team crows = new Team("The Crows");

        League league = new League();
        league.addTeam(robins);
        league.addTeam(hens);
        league.addTeam(owls);
        league.addTeam(swallows);
        league.addTeam(crows);

        var teams = league.getTeams();
        for (int i = 0; i < teams.size(); i++) {
            for (int j = i + 1; j < teams.size(); j++) {
                league.addGame(new Game(teams.get(i), teams.get(j)));
            }
        }

        league.playAllGames();
        league.showTable();
    }
}






