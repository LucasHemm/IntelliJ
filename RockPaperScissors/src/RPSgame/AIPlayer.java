package RPSgame;

import java.util.Random;


public class AIPlayer implements Player{

    String aiName;

    public AIPlayer(String aiName){
        this.aiName = aiName;
    }

    public int choose(String message){

    Random rand = new Random();
    int randNum = rand.nextInt(3);
    return randNum;

    }


    public String getName(String playerNum) {
        return null;
    }


    public String getName2() {
        return this.aiName;
    }
}
