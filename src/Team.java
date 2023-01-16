import java.util.ArrayList;


public class Team<T extends PlayerI> {
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T playerI) {
        if (members.contains(playerI)) {
            System.out.println(playerI.getName() + " is already on the list");
            return false;
        } else {
            members.add(playerI);
            System.out.println(playerI.getName() + " picked for team " + this.name);
            return true;
        }
    }

    public int numPlayer() {
        return this.members.size();
    }

    public void matchResult(Team opponent, int ourScore, int theirScore) {
        if (ourScore > theirScore) won++;
        else if (ourScore == theirScore) tied++;
        else lost++;
        played++;
        if (opponent != null) opponent.matchResult(null, theirScore, ourScore);
    }

    public int ranking() {
        return (won * 2) + tied;
    }
}














