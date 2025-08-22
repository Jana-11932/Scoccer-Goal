package soccer.play;

public class GameResult {
    private Team home;
    private Team away;
    private int homeGoals;
    private int awayGoals;

    public GameResult(Team home, Team away, int homeGoals, int awayGoals) {
        this.home = home;
        this.away = away;
        this.homeGoals = homeGoals;
        this.awayGoals = awayGoals;
    }

    public String toString() {
        return home + " " + homeGoals + " - " + awayGoals + " " + away;
    }
}

