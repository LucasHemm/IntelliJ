package com.company;
import java.util.ArrayList;

public class Game {
    ArrayList<Player> players = new ArrayList<>();
    public Game(){
        Player player1 = new Player("Lucas", 100);
        Player player2 = new Player("Hans", 200);
        Player player3 = new Player("Peter", 300);
        players.add(player1);
        players.add(player2);
        players.add(player3);
    }


}
