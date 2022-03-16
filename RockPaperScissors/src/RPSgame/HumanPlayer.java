package RPSgame;

import textui.TextUI;

public class HumanPlayer implements Player{
    private final boolean hotseat;
    private TextUI ui;
    private String name;

    public HumanPlayer(boolean hotseat, TextUI ui){
        this.hotseat = hotseat;
        this.ui = ui;

    }


    public int choose() {
        String[] choices = {"Rock", "Paper", "Scissors"};
        int choice = ui.select("Please choose your weapon of combat", choices, "press enter when ready!");
        return choice;

    }
}
