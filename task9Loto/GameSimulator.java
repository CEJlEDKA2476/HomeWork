package com.company.task9Loto;

/**
 * This class controls your game
 */
public class GameSimulator {
    private static final int MAX_COUNTER_NUMBER = 3;
    private final Integer[] winNumbers = NumberGenerator.generate(Const.NUMBER_OF_WIN_ARGS);

    public boolean lottoPlay(Integer[] winNumbers, Integer[] playerNumbers) {
        int counter = 0;
        for (Integer winNumber : winNumbers) {
            for (Integer playerNumber : playerNumbers) {
                if (winNumber.equals(playerNumber)) {
                    counter++;
                }
            }
        }
        return counter == MAX_COUNTER_NUMBER;
    }

    public Integer[] getWinNumbers() {
        return winNumbers;
    }
}
