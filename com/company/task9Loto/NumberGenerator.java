package com.company.task9Loto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/**
 * Generate random numbers
 */
public class NumberGenerator {
    private static final int MAX_RANDOM_NUMBER = 49;

    public static Integer[] generate(int numberCount) {
        HashSet<Integer> hashSet = new HashSet<>();
        while (hashSet.size() < numberCount) {
            hashSet.add(getRandom());
        }
        ArrayList<Integer> arrayList = new ArrayList<>(hashSet);
        Collections.shuffle(arrayList);
        Integer[] finalArray = new Integer[hashSet.size()];
        arrayList.toArray(finalArray);
        return finalArray;
    }

    private static int getRandom() {
        return 1 + (int) (Math.random() * (MAX_RANDOM_NUMBER));
    }
}
