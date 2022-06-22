package com.company.task9Loto;

import java.util.ArrayList;

public class Main {
    private static final int NUMBER_OF_PLAYERS = 3;
    public static void main(String[] args) {
        MenuController menuController = new MenuController();
        do {
            ArrayList<Participant> participantArrayList = ParticipantFactory.generatePlayers(NUMBER_OF_PLAYERS);

            menuController.outputPlayers(participantArrayList);

            int choiceNumber = menuController.choicePlayer();

            menuController.outputWin(participantArrayList, choiceNumber);

        } while (menuController.ifPlayAgain() == 1);
    }
    // menuController, static, hashtable, теория map,
    // winNumber -static,
    //Написать магазин()
}

