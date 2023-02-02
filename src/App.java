import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Player player1 = new Player("Tori");
        player1.addSport("soccer");
        player1.addSport("hockey");
        player1.addSport("rugby");

        Player player2 = new Player("Chris");
        player2.addSport("basketball");
        player2.addSport("baseball");
        player2.addSport("golf");
        player2.addSport("rugby");

        Player player3 = new Player("Megan");
        player3.addSport("soccer");
        player3.addSport("hockey");
        player3.addSport("water polo");

        String[] listOfSports = { "soccer", "hockey", "rugby", "basketball", "baseball", "golf", "water polo" };

        ArrayList<Player> players = new ArrayList<>();
        players.add(player1);
        players.add(player2);
        players.add(player3);

        for (String sport : listOfSports) {
            for (Player player : players) {
                ArrayList<String> sports = player.getSports();
                if (sports.contains(sport)) {
                    System.out.println(player.name + " plays " + sport);
                }
            }
        }
    }
}
