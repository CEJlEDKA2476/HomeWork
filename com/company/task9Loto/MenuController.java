package com.company.task9Loto;

import com.company.task9Loto.menutext.MenuTextProvider;
import com.company.task9Loto.menutext.MenuTextProviderFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * This class is about menu
 */
public class MenuController {
    private final GameSimulator gameSimulator = new GameSimulator();
    private final MenuTextProvider menuTextProvider = MenuTextProviderFactory.getMenuTextProvider();


    public void outputPlayers(ArrayList<Participant> participantArrayList) {
        System.out.println(menuTextProvider.getPrintingPlayersText());
        printParticipants(participantArrayList);
        System.out.println("Выигрышная комбинация - \n" + Arrays.toString(gameSimulator.getWinNumbers()));
    }

    public int choicePlayer(){
        System.out.println("Выберите игрока.");
        Scanner in = new Scanner(System.in);
        return in.nextInt() - 1;
    }

    public void outputWin(ArrayList<Participant> participantArrayList, int choiceNumber) {
        System.out.println("Происходит подсчет.");
        if (gameSimulator.lottoPlay(gameSimulator.getWinNumbers(),
                participantArrayList.get(choiceNumber).getNumbers())) {
            System.out.println("ВЫ ВЫИГРАЛИ!");
        } else {
            System.out.println("Вы проиграли.");
        }
    }

    public int ifPlayAgain(){
        System.out.print("Хотите сыграть снова?\n 1 - Сыграть снова.\n 2 - Закончить игру.\n");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    private void printParticipants(ArrayList<Participant> arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println((i + 1) + ". " + Arrays.toString(arrayList.get(i).getNumbers()));
        }
    }


}
