package soccer.util;

import soccer.play.Player;
import java.util.*;

public class PlayerDatabase {

    private Map<String, Player> players = new HashMap<>();

    public void addPlayer(Player p) throws PlayerDatabaseException {
        if (players.containsKey(p.toString())) {
            throw new PlayerDatabaseException("Player already exists");
        }
        players.put(p.toString(), p);
    }

    public Player getPlayer(String name) {
        return players.get(name);
    }

}

