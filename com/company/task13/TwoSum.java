package com.company.task13;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println("Введите цель.");
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();

        System.out.println("Введите массив чисел из 5 чисел.");
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = in.nextInt();
        }

        for (int i : numbers) {
            for (int j = 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    System.out.println("Числа для сложения - " + numbers[i] + " и " + numbers[j]);
                    return;
                }
            }
        }
    }
}

//    fun twoSum(nums: IntArray, target: Int): IntArray? {
//        val map = HashMap<Int, Int>()
//        for (i in 0 .. nums.lastIndex) {
//        val missedNumber = target - nums[i]
//        if (map.containsKey(missedNumber)) {
//        return intArrayOf(map[missedNumber] as Int, i)
//        }
//        map[nums[i]] = i
//        }
//        return null
//        }