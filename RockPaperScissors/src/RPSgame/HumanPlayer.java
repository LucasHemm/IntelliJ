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

    @Override
    public int guess() {
        return 0;
    }
}
