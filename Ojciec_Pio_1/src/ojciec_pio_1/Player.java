package ojciec_pio_1;

import java.util.Random;

    class Player {
    int Guess() {
        Random dice = new Random();
        return dice.newInt(6) +1;
    }
}

