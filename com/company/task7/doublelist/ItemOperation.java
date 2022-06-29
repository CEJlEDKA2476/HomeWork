package com.company.task7.doublelist;

import java.util.Scanner;

public class ItemOperation {


    public static Item output() {
        Item item = null;
        String text = null;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите числа или e");
        do {
            text = in.nextLine();
            try {
                int number = Integer.parseInt(text);
                Item newItem = new Item(number);
                Item lastItem = lastObject(item);
                if (lastItem != null) {
                    newItem.setPreviousItem(lastItem);
                    lastItem.setNextItem(newItem);
                } else {
                    item = newItem;
                }
            } catch (Exception e) {
                e.printStackTrace();
                if (!text.equals("e")) {
                    System.out.println("Введенный символ - не число.");
                }
            }
        } while (!text.equals("e"));
        return item;
    }

    private static Item lastObject(Item item) {
        if (item != null) {
            Item itemX = item;
            while (itemX.getNextItem() != null) {
                itemX = itemX.getNextItem();
            }
            return itemX;
        } else {
            return null;
        }
    }




}
