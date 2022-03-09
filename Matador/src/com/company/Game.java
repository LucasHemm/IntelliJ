package com.company;
import java.util.ArrayList;

public class Game {
    ArrayList<Player> players = new ArrayList<>();
    private FileIO fileio = new FileIO();
    private TextUI textUi = new TextUI();

    public Game(){
        ArrayList<String> data;
        data = fileio.readGameData();
        //this.createPlayers(data);

        if(data == null){
            System.out.println("vi fandt ingen data");
            data = textUi.getPlayerNames("Skriv spillernavn. Tast Q for at quitte");
        }
            createPlayers(data);
    }
    private void createPlayers(ArrayList<String> data){
        for(String s : data){
            String[] values = s.split(": ");
            //int balance = Integer.parseInt(values[1]);
            int balance = Integer.parseInt(values[1]);


            Player p = new Player(values[0], balance);
            players.add(p);
        }
    }

}
