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


    public int choose(String message) {
        String[] choices = {"Rock", "Paper", "Scissors"};
        int choice = ui.select(message + ", please choose your weapon of combat", choices, "press enter when ready!");
        return choice;
    }

    public String getName(String playerNum)
    {

        if(name == null)
        {
            ui.print(playerNum + ": What is your name?");
            name = ui.get();
            ui.clear();
        }
        return name;
    }
    public String getName2()
    {
        return name;
    }

}
