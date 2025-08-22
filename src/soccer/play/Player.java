package soccer.play;

public class Player implements Comparable<Player> {

    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    public int compareTo(Player other) {
        return this.name.compareTo(other.name);
    }

}




