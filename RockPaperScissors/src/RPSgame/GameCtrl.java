package RPSgame;

import textui.TextUI;
public class GameCtrl {

    private TextUI ui;

    public GameCtrl(TextUI ui){
        this.ui = ui;

    }

    public void runGame(Player player1, Player player2){


        int player1Result = 0;
        int player2Result = 0;
        while(player1Result != 3 || player2Result != 3){

            player1.choose();
            player2.choose();
            evaluate();

        }
    }

    public void evaluate(){


    }





}
