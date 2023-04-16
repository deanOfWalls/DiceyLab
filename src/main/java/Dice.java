import java.util.Random;

public class Dice {

    public int numOfDice;

    public Dice(int numOfDice) {
        this.numOfDice = numOfDice;
    }

    public int Roll() {
        int min = 1;
        int max = 6;
        Random random = new Random();
        int randomRoll = random.nextInt((max - min) + 1) + min;

        return randomRoll;
    }

    public int TossAndSum() {
        int sum = 0;
        for (int i = 0; i < this.numOfDice; i++) {
            sum += Roll();
        }
        return sum;
    }


    //track number of rolls
    //generate random number x num of times (for loop)
    //number of dice


}
