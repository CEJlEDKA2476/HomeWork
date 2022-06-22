package com.company.task6.liststructure.list;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Item item = output();
        printStructure(item);
        replace(item);
//        menu(item);
    }

    private static Item output() {   //Заменить рекурсией вывод + меню + замена + поиск + вывод длинны + удаление + написать двух связный список + размер стека
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
                    lastItem.setNext(newItem);
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
            while (itemX.getNext() != null) {
                itemX = itemX.getNext();
            }
            return itemX;
        } else {
            return null;
        }
    }

    private static void printStructure(Item item) {
        if (item != null) {
            Item nextItem = item;
            while (nextItem != null) {
                System.out.println(nextItem.getData());
                nextItem = nextItem.getNext();
            }
//            System.out.println(item.getData());
//            if(item.getNext() != null){
//                printStructure(item.getNext());
//            }
        }
    }

    private static void menu(Item item) {
        System.out.println("Выберите число действия.");
        int numberOfAction;
        do {
        System.out.print("1. Замена\n2. Поиск\n3. Вывод длины\n4. Удаление\n5. Выход\n");
        Scanner in = new Scanner(System.in);
        numberOfAction = in.nextInt();
            switch (numberOfAction) {
                case 1:
                    replace(item);
                    break;
                case 2:
                    search(item);
                    break;
                case 3:
                    length(item);
                    break;
                case 4:
                    delete(item);
                    break;
                case 5:
                    System.out.println("Выход...");
                    break;
                default:
                    System.out.println("Введен не верный номер.");
                    break;
            }
        }while (numberOfAction != 5);
    }

    private static void replace(Item item) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 2 числа, которые хотите поменять местами");
        int number1 = in.nextInt();
        int number2 = in.nextInt();

        Item itemZ = findItem(item, number1 - 1); //1
        Item itemX = findItem(item, number2 - 1); //3
        Item itemC = findItem(item, number1); // 2
        Item itemY = findItem(item, number2); // 4

        itemZ.setNext(itemY);
        itemX.setNext(itemC);
        itemC.setNext(itemY.getNext());
        itemY.setNext(itemX);

        printStructure(item);
    }

    private static void length(Item item) {
        int length = 1;
        if (item != null) {
            Item itemX = item;
            while (itemX.getNext() != null) {
                itemX = itemX.getNext();
                length++;
            }
        }
        System.out.println("Длина = " + length);
    }

    private static Item findItem(Item item, int index){
        int counter = 1;
        Item itemX = item;
        Item itemC = item;
        while(itemC.getNext() != null){
            itemC = itemC.getNext();
            if(counter == index){
                itemX = itemC;
                break;
            }
            counter++;
        }
        return itemX;
    }

    private static void delete(Item item) {
        System.out.println("Введите индекс числа, которое хотите удалить.");
        Scanner in = new Scanner(System.in);
        int deletedIndex = in.nextInt();
        Item itemC = findItem(item, deletedIndex);
        System.out.println(itemC);
        Item itemY = findItem(item, deletedIndex - 1);
        itemY.setNext(itemC.getNext());

        printStructure(item);

//        int counter = 0;
//        int counterX = 1;
//        Item itemL = item;
//        Item itemAdress = null;
//        int deletedIndex = in.nextInt();
//        Item nextItem = null;
//        while (itemL.getNext() != null) {
//            itemL = itemL.getNext();
//            counter++;
//            if (counter == deletedIndex) {
//                nextItem = itemL.getNext();
//                counter--;
//                break;
//            }
//        }
//        itemL = item;
//        Item itemE = itemL.getNext();
//        while (itemE != null) {
//            itemE = itemE.getNext();
//            counterX++;
//            if (counterX == counter) {
//                if (itemE != null) {
//                    itemE.setNext(nextItem);
//                }
//            }
//        }
//    printStructure(itemL);





    }

    private static void search(Item item) {
        System.out.println("Введите число, которое хотите найти.");
        Scanner in = new Scanner(System.in);
        int searchNumber = in.nextInt();
        int counter = 1;
        if (item != null) {
            Item itemX = item;
            while (itemX.getNext() != null) {
                if (itemX.getData() != searchNumber) {
                    itemX = itemX.getNext();
                    counter++;
                } else {
                    System.out.println("Порядковый номер числа - " + counter);
                    break;
                }
            }
        }
    }
}