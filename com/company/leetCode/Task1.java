package leetCode;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] nums = {3,3};
        int target = 6;

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int resultArray[] = new int[2];

        for (int i = 0; i < nums.length; i++) {
            resultArray[0] = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
            resultArray[1] = nums[j];
                if(resultArray[0] + resultArray[1] == target){
                    resultArray[0] = i;
                    resultArray[1] = j;
                    return resultArray;
                }
            }
        }
        return resultArray;
    }
}
