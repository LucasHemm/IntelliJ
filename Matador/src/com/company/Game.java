package com.company;
import java.util.ArrayList;

public class Game {
    ArrayList<Player> players = new ArrayList<>();
    FileIO fileio = new FileIO();

    public Game(){
        ArrayList<String> data = new ArrayList<>();
        data = fileio.readGameData();
        for(String s : data){
            String[] values = s.split(": ");
            int balance = Integer.parseInt(values[1]);
            Player p = new Player(values[0], balance);
            players.add(p);
        }
    }


}
