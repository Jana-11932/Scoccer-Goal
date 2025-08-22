package soccer.play;

import java.util.*;

public class League {
    private List<Team> teams = new ArrayList<>();
    private List<Game> games = new ArrayList<>();

    public void addTeam(Team t) {
        teams.add(t);
    }
    public List<Team> getTeams() {
        return teams;
    }


    public void addGame(Game g) {
        games.add(g);
    }

    public void playAllGames() {
        Random rnd = new Random();
        for (Game g : games) {
            if (!g.isFinished()) {
                int homeGoals = rnd.nextInt(4); // 0–3
                int awayGoals = rnd.nextInt(4);
                g.playGame(homeGoals, awayGoals);
            }
        }
    }

    public void showTable() {
        // header
        System.out.print("-----------------------------------------------------------------------------------------------\n");
        System.out.print("|              ");
        for (Team t : teams) {
            System.out.printf("| %-10s ", t.getName());
        }
        System.out.println("| Points | Goals |");
        System.out.print("-----------------------------------------------------------------------------------------------\n");

        // rows
        for (Team rowTeam : teams) {
            System.out.printf("| %-12s", rowTeam.getName());

            for (Team colTeam : teams) {
                if (rowTeam == colTeam) {
                    System.out.printf("| %-10s ", "X");
                } else {
                    Game g = findGame(rowTeam, colTeam);
                    if (g != null && g.isFinished()) {
                        System.out.printf("| %d - %-6d ", g.getHomeGoals(rowTeam), g.getAwayGoals(colTeam));
                    } else {
                        System.out.printf("| %-10s ", " ");
                    }
                }
            }

            // print points & goals
            System.out.printf("| %-6d| %-6d|\n", rowTeam.getPoints(), rowTeam.getGoals());
            System.out.print("-----------------------------------------------------------------------------------------------\n");
        }
    }

    private Game findGame(Team home, Team away) {
        for (Game g : games) {
            if (g.hasTeams(home, away)) {
                return g;
            }
        }
        return null;
    }
}


