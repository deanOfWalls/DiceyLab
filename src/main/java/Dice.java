import java.util.Random;

public class Dice {
    public static void main(String[] args) {

        int min = 2;
        int max = 12;
        Random random = new Random();
        int randomRoll = random.nextInt((max - min) + 1) + min;

    }


}
