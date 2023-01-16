import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
//        ArrayList<Integer> items = new ArrayList< >();
//        items.add(1);
//        items.add(2);
//        items.add(3);
//        items.add(4);
//        items.add(5);
//        printDoubled(items);
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseBallPlayer pat = new BaseBallPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> crows= new Team<>("Crows");
        crows.addPlayer(joe);
//        crows.addPlayer(pat);
//        crows.addPlayer(beckham);
        System.out.println(crows.numPlayer());
        Team<BaseBallPlayer> baseBallPlayerTeam = new Team<>("Chicago Cubs");
        baseBallPlayerTeam.addPlayer(pat);
        Team<SoccerPlayer> brokenTeam = new Team<>("This won't work");
        brokenTeam.addPlayer(beckham);
    }
    private static void printDoubled(ArrayList<Integer> n){
//        for(Object i: n){
//            System.out.println((Integer) i * 2);
//        }
        for(Integer i : n){
            System.out.println(i * 2);    //generic
        }
    }
}
