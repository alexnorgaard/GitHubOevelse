package terning;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {
    Dice diceTest = new Dice();
    @org.junit.jupiter.api.Test
    void roll() {
        int roll = 0;
        roll = diceTest.roll();
        assertTrue(roll > 0 && roll < 7);

    }

    @org.junit.jupiter.api.Test
    void rollMultiple() {
        int one = 0, two = 0, three = 0, four = 0, five = 0, six = 0, tal = 0;
        for (int i = 0; i < 60000; i++){
            tal = diceTest.roll();
            switch (tal) {
                case 1: {
                    one++;
                    break;
                }
                case 2: {
                    two++;
                    break;
                }
                case 3: {
                    three++;
                    break;
                }
                case 4: {
                    four++;
                    break;
                }
                case 5: {
                    five++;
                    break;
                }
                case 6: {
                    six++;
                    break;
                }

            }
        }

        System.out.println("# of 1's: " + one);
        System.out.println("# of 2's: " + two);
        System.out.println("# of 3's: " + three);
        System.out.println("# of 4's: " + four);
        System.out.println("# of 5's: " + five);
        System.out.println("# of 6's: " + six);

        assertEquals(10000, one, 400);
        assertEquals(10000, two, 400);
        assertEquals(10000, three, 400);
        assertEquals(10000, four, 400);
        assertEquals(10000, five, 400);
        assertEquals(10000, six, 400);

    }
}