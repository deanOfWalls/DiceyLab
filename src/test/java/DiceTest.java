import org.junit.Assert;
import org.junit.Test;


public class DiceTest {
    @Test
    public void testDiceConstructor() {
        //GIVEN
        int numOfDice = 2;
        //WHEN
        Dice dice = new Dice(numOfDice);
        //THEN
        Assert.assertEquals(numOfDice, dice.numOfDice);
    }

    @Test
    public void Roll() {
        //GIVEN
        Dice dice = new Dice(1);
        //WHEN
        int result = dice.Roll();
        //THEN
        Assert.assertTrue(result >=1 && result <=6);

    }
    @Test
    public void diceSum() {
        //GIVEN
        Dice dice = new Dice(2);
        //WHEN
        int result = dice.TossAndSum();
        //THEN
        Assert.assertTrue(result >= 2 && result <=12);
    }

    @Test
    public void name() {


    }
}