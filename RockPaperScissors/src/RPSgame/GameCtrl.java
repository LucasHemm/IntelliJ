package RPSgame;

import textui.TextUI;
public class GameCtrl {

    private TextUI ui;
    private int player1Result = 0;
    private int player2Result = 0;

    public GameCtrl(TextUI ui){
        this.ui = ui;

    }

    public void runGame(Player player1, Player player2){
        player1Result = 0;
        player2Result = 0;
        int p1Choice;
        int p2Choice;
        while(player1Result != 3 && player2Result != 3){

            p1Choice = player1.choose(player1.getName("Player 1"));
            ui.clear();
            p2Choice = player2.choose(player2.getName("Player 2"));
            ui.clear();
            evaluate(p1Choice, p2Choice, player1, player2);
            System.out.println("results so far is: \n" + player1.getName2() + ": " + player1Result + "!"
                                + "          " + player2.getName2() + ": " + player2Result + "!");
            ui.print("Press enter to start turn");
            ui.get();
            ui.clear();

        }

        if(player1Result == 3){
            ui.print(player1 .getName2() + ", you have won!");
        } else ui.print(player2.getName2() + ", you have won!");
    }

    private void evaluate(int p1Choice, int p2Choice, Player player1, Player player2){

        if(p1Choice == p2Choice){
            System.out.println("Both chose the same weapon - no points given");
        }
        else if(p1Choice == 0 && p2Choice == 1){
            player2Result += 1;
            System.out.println(player2.getName2() + " beat " + player1.getName2() + "'s Rock with Paper");
        }
        else if(p1Choice == 0 && p2Choice == 2){
            player1Result += 1;
            System.out.println(player1.getName2() + " beat " + player2.getName2() + "'s Scissors with Rock");
        }
        else if(p1Choice == 1 && p2Choice == 0){
            player1Result += 1;
            System.out.println(player1.getName2() + " beat " + player2.getName2() + "'s Rock with Paper");
        }
        else if(p1Choice == 1 && p2Choice == 2){
            player2Result += 1;
            System.out.println(player2.getName2() + " beat " + player1.getName2() + "'s Paper with Scissors");
        }
        else if(p1Choice == 2 && p2Choice == 0){
            player2Result += 1;
            System.out.println(player2.getName2() + " beat " + player1.getName2() + "'s Scissors with Rock");
        }
        else if(p1Choice == 2 && p2Choice == 1){
            player1Result += 1;
            System.out.println(player1.getName2() + " beat " + player2.getName2() + "'s Paper with Scissor");
        }
    }





}
