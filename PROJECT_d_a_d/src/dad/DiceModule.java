package dad;

import java.util.Random;

public class DiceModule {

    Random random = new Random();
    public int diceFour() {
        int diceroll = 0;
        diceroll = 1+random.nextInt(4);
        return diceroll;
    }

    public int diceSix() {
        int diceroll = 0;
        diceroll = 1+random.nextInt(6);
        return diceroll;
    }

    public int diceTen() {
        int diceroll = 0;
        diceroll = 1+random.nextInt(10);
        return diceroll;
    }

    public int diceTwenty() {
        int diceroll = 0;
        diceroll = 1+random.nextInt(20);
        return diceroll;
    }



}
