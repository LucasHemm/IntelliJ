package com.company;
import java.util.ArrayList;

public class Game {

    ArrayList<Player> players = new ArrayList<>();
    private FileIO fileIO = new FileIO();
    private TextUI textUI = new TextUI();
    private Dice dice = new Dice();
    private Player currentPlayer;
    private Board board;

    public Game() {

        //*****************
        //loader spiller data
        ArrayList<String> data = new ArrayList<>();
        data = fileIO.readGameData();
        // på hver plads i data står der et navn og en saldo fx. "Tobias: 30000"
        if (data == null) {
            System.out.println("vi fandt ikke noget data, spørg brugeren");
            //hent data fra brugerinterfacet dvs. spørg brugeren
            data = textUI.getPlayerNames("Skriv spillernavn. Tast Q for at quitte");
        }
        this.createPlayers(data);

        //****************
        //loader field data
        String[] fieldData = fileIO.readFieldData();
        //System.out.println(fieldData[fieldData.length-1]);

        board = new Board(fieldData);
        //System.out.println(board.getField(11));

        //GAMELOOP
        this.currentPlayer = this.players.get(0);
        takeTurn();
    }

    private void takeTurn(){
        int diceValue =  1; //dice.rollDiceSum();
        textUI.displayMessage(this.currentPlayer.getName() + " Rolled " + diceValue);
        int position = currentPlayer.updatePosition(diceValue);
        Field f = board.getField(position);
       // System.out.println("You landed on " + f);
        String decisionRequest = f.onLand(currentPlayer);
        String response = textUI.getUserInput(decisionRequest);
        String processedResponse = f.processResponse(currentPlayer, response);
        textUI.displayMessage(processedResponse+ ", " + board.getField(position) + ".\nTheir Bank balance: " + currentPlayer.getBalance());

    }


    private void createPlayers(ArrayList<String> data) {

        for (String s : data) {

            String[] values = s.split(": "); //split arrayet så vi får adskildt de to værdier
            int balance;

            if (values.length > 1) {
                balance = Integer.parseInt(values[1]); // todo: hvis values[1] == null, skal den sættes til 30000 (maxbeløb)

            } else {
                balance = Integer.parseInt("30000");
            }
            Player p = new Player(values[0], balance); // brug de to værdier til at lave en ny Player instans

            players.add(p);                            // tilføj Player instansen til array'et af spillere

        }

    }
}
