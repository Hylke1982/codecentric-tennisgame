package nl.codecenteric.tennisgame;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

/**
 * Hylke Stapersma (codecentric nl)
 * hylke.stapersma@codecentric.nl
 */
public class TennisGameTest {

    private TennisGame tennisGame;

    @Before
    public void before() {
        tennisGame = new TennisGame();
    }

    @Test
    public void testScore() throws Exception {
        while (true) {
            Random random = new Random();
            boolean x = random.nextBoolean();
            int player = x ? 0 : 1;
            tennisGame.score(player);
        }
    }
}
