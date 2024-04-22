import java.util.ArrayList;
import java.util.Iterator;

public class Team implements Iterable<Player>{
    private String name;
    private ArrayList<Player>players;

    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addPlayers(Player player) {
        players.add(player);
    }

    @Override
    public Iterator<Player> iterator() {
        return players.iterator();
    }
}
