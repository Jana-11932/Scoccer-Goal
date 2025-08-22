package soccer.play;

public class Game {
    private Team home;
    private Team away;
    private int homeGoals = 0;
    private int awayGoals = 0;
    private boolean finished = false;

    public Game(Team home, Team away) {
        this.home = home;
        this.away = away;
    }

    // set final score and update team stats
    public void playGame(int homeGoals, int awayGoals) {
        this.homeGoals = homeGoals;
        this.awayGoals = awayGoals;
        this.finished = true;

        // update teams
        home.addGoals(homeGoals);
        away.addGoals(awayGoals);

        if (homeGoals > awayGoals) {
            home.addPoints(3);
        } else if (awayGoals > homeGoals) {
            away.addPoints(3);
        } else {
            home.addPoints(1);
            away.addPoints(1);
        }
    }

    public boolean isFinished() {
        return finished;
    }

    public String getResult() {
        if (!finished) return "Match not played yet";
        return home.getName() + " " + homeGoals + " - " + awayGoals + " " + away.getName();
    }

    @Override
    public String toString() {
        return home + " vs " + away;
    }

    public int getHomeGoals(Team team) {
        if (team == home) return homeGoals;
        if (team == away) return awayGoals;
        return 0;
    }

    public int getAwayGoals(Team team) {
        if (team == home) return awayGoals;
        if (team == away) return homeGoals;
        return 0;
    }

    public boolean hasTeams(Team t1, Team t2) {
        return (home == t1 && away == t2) || (home == t2 && away == t1);
    }

}



