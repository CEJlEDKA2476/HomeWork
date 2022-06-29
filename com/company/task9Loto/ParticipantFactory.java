package com.company.task9Loto;

import java.util.ArrayList;

/**
 * This class generate ArrayList with random numbers and your players
 */
public class ParticipantFactory {

    public static ArrayList<Participant> generatePlayers(int numberOfPlayers) {
        ArrayList<Participant> participantArrayList = new ArrayList<>();
        for (int i = 0; i < numberOfPlayers; i++) {
            participantArrayList.add(i, new Participant(NumberGenerator.generate(3)));
        }
        return participantArrayList;
    }
}
