package RPSgame;

import textui.SysTextUI;
import textui.TextUI;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        Player player1 = null;
        Player player2 = null;
        TextUI ui = new SysTextUI();
        String[] PlayerChoices = {"Human Player", "AI Player"};
        int playerOneType = ui.select("Select Player1 type:", PlayerChoices, "Enter your choice:");
        int playerTwoType = ui.select("Select Player2 type:", PlayerChoices, "Enter your choice:");
        boolean hotseat = playerOneType == 0 && playerTwoType == 0;
        if(playerOneType == 0)
        {
            player1 = new HumanPlayer(hotseat, ui);
        }
        else
        {
            player1 = new AIPlayer();
        }
        if(playerTwoType == 0)
        {
            player2 = new HumanPlayer(hotseat, ui);
        }
        else
        {
            player2 = new AIPlayer();
        }
        GameCtrl gameCtrl = new GameCtrl(ui);
        gameCtrl.runGame(player1, player2);
    }
}