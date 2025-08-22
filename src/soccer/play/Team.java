package soccer.play;

import java.util.ArrayList;
import java.util.List;

public class Team implements Comparable<Team>, IDisplayDataItem {

    private String name;
    private List<Player> players = new ArrayList<>();
    private int points = 0;
    private int goals = 0;

    public Team(String name) {
        this.name = name;
    }

    public void addPlayer(Player p) {
        players.add(p);
    }

    public void addPoints(int p) {
        points += p;
    }

    public void addGoals(int g) {
        goals += g;
    }

    public int getPoints() {
        return points;
    }

    public int getGoals() {
        return goals;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Team other) {
        if (this.points != other.points) {
            return Integer.compare(other.points, this.points); // higher points first
        }
        return Integer.compare(other.goals, this.goals); // tie-breaker by goals
    }

    @Override
    public boolean isDetailAvailable() {
        return true;
    }

    @Override
    public String getDisplayDetail() {
        return name + " | Points: " + points + " | Goals: " + goals;
    }

    @Override
    public int getID() {
        return name.hashCode();
    }

    @Override
    public String getDetailType() {
        return "Team";
    }

    @Override
    public String toString() {
        return name;
    }
}

