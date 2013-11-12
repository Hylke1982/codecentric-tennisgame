package nl.codecenteric.tennisgame;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Hylke Stapersma (codecentric nl)
 * hylke.stapersma@codecentric.nl
 */
public class TennisGame {

    private static final Integer[] SCOREORDER = {0,15, 30, 40};

    private Integer[] currentGameScore = {0, 0};
    private Integer[] currentSetScore = {0, 0};

    protected void score(int player) {
        currentGameScore[player]++;
        if (currentGameScore[player] >= SCOREORDER.length) {
            resetCurrentGameScore(player);
            System.out.println(String.format("Player %s won the game",player));
        }else{
            System.out.println(String.format("Score %s - %s", SCOREORDER[currentGameScore[0]],SCOREORDER[currentGameScore[1]]));
        }
    }

    private void resetCurrentGameScore(int player) {
        currentSetScore[player]++;
        currentGameScore = new Integer[]{0,0};
        System.out.println(String.format("Current set score %s - %s", currentSetScore[0],currentSetScore[1]));
        if (Math.abs(currentSetScore[0] - currentSetScore[1]) >= 2) {
            System.out.println(String.format("Player %s won the match", player));
            System.exit(1);
        }
    }
}
