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
        int playerOneType = ui.select("Select Player 1 type:", PlayerChoices, "Enter your choice:");
        int playerTwoType = ui.select("Select Player 2 type:", PlayerChoices, "Enter your choice:");
        ui.clear();
        if(playerOneType == 0)
        {
            player1 = new HumanPlayer(ui);
        }
        else
        {
            player1 = new AIPlayer("AI 1");
        }
        if(playerTwoType == 0)
        {
            player2 = new HumanPlayer(ui);
        }
        else
        {
            player2 = new AIPlayer("AI 2");
        }
        GameCtrl gameCtrl = new GameCtrl(ui);
        gameCtrl.runGame(player1, player2);
    }
}